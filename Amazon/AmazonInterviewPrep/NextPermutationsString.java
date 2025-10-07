package Amazon.AmazonInterviewPrep;

public class NextPermutationsString {

  public static String nextPermuationString(String s){
      char[] arr = s.toCharArray();
      int n = arr.length;

      int i = n - 2;
      
      //Step 1. Find pivot
      
      while (i >= 0 && arr[i] >= arr[i+1]) {
        i--;
      }

      //Step 2. Find successor
      if (i >= 0) {
        int j = n - 1;
        while (arr[j] <= arr[i]) {
          j--;
        }
        //Step 3: Swap Pivot & sucessor.
        swap(arr, i, j);
      }

      

      
      //Step 4: Reverse suffix
      reverse(arr, i+1, n-1);

      return new String(arr);
  }

  public static void swap(char[] arr, int i, int j){
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    
  }

  public static void reverse(char[] arr, int start, int end){
    while (start < end) {
      swap(arr, start, end);
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    System.out.println(nextPermuationString("abedc")); //acbde
    System.out.println(nextPermuationString("dcba")); //abcd
    System.out.println(nextPermuationString("aabb")); //abab
    
  }

}



/*
 * 🔹 Problem Statement

Given a sequence (numbers or characters), rearrange it into its next lexicographically greater permutation.
If no such permutation exists (the sequence is the highest possible order), return the sequence in ascending order.
 * 
 * 
 * 
 * 🔹 Approach (Step-by-Step)

Find the pivot:

Traverse from right to left, find the first index i such that arr[i] < arr[i+1].

This index is called the pivot. If no such index exists → the array/string is in descending order (largest permutation).
→ return ascending sorted order.

Find the successor:

Again, traverse from right to left, find the first index j such that arr[j] > arr[i].

Swap pivot & successor:

Swap characters at indices i and j.

Reverse the suffix:

Reverse the sequence from i+1 to end.

This ensures it’s the next smallest permutation.


Example (Characters)

Input: "abedc"

Step 1: Pivot = 'b' (index 1, because 'b' < 'e').

Step 2: Successor = 'c' (rightmost char > 'b').

Step 3: Swap → "acedb".

Step 4: Reverse suffix after pivot → "acbde".

Output: "acbde"


🔹 Complexity

Time Complexity:

Finding pivot + successor: O(n)

Reversing suffix: O(n)
→ Overall: O(n)

Space Complexity:

In-place swap & reverse → O(1) (excluding input/output).


🔹 Edge Cases

"zzz" → "zzz" → ascending "zzz"

"dcba" → "abcd"

"aabb" → "abab"

Single char: "a" → "a"


Type: Lexicographic Scan (Pivot → Successor → Reverse)
Time: O(n)
Space: O(1)

 * 
 * 
 */