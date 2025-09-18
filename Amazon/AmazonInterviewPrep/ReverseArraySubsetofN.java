package Amazon.AmazonInterviewPrep;

import java.util.Arrays;

public class ReverseArraySubsetofN {

  public static void reverseArrayN(int[] arr, int n){
    //1. transverse the array and length

    for(int i= 0; i<arr.length; i+=n){
      //2. Find start and end index of current group
      int left = i;
      int right = Math.min(i+n - 1, arr.length - 1);

      //3. Reverse elements within this group
      while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      }
    }
    
    
  }



  public static void main(String[] args) {
    int[] arr = {1,3,5,7,9,11,15,17,19};
    int n = 6;

    System.out.println("Before reverse the group "+Arrays.toString(arr));

    reverseArrayN(arr, n);

    
    System.out.println("After reverse the group "+Arrays.toString(arr));


  }

}


/*
 * 
 * 
 * ✅ Problem

You are given an array and a subset size N.
Reverse each group of N elements in the array.

Example:

Input → [1,3,5,7,9,11,15,17,19], N=3
Output → [5,3,1,11,9,7,19,17,15]

Approach Implemented (Iterative, Two-Pointer Technique in Groups)
 * 
 * 
 * ✅ Complexity Analysis

Time Complexity → O(n) → Each element is visited once.

Space Complexity → O(1) → In-place reversal, no extra storage.



✅ Edge Cases

N = 1 → Array remains the same.

N = array length → Whole array is reversed.

N > array length → Just reverse the entire array once.

Array empty → Nothing to reverse.

Array length not divisible by N → Last group reversed with fewer elements.


✅ Interview Follow-ups

What if you want to skip reversing the last group if its size < N?
→ Add a check if (end - start + 1 < n) continue;.

How would you solve this if the array is streamed (not fully in memory)?
→ Use a sliding buffer of size N.

Can you do it with recursion instead of iteration?
→ Yes, but less efficient for large arrays.


✅ Alternative Approach (Using Extra Array)

Instead of reversing in place, create a new array and fill reversed groups into it.
 */