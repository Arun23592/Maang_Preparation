package Maang_Preparation.Amazon.Arrays;

import java.util.Arrays;

public class ReverseArrayWithSubsetN {

  public static void reverseInSubset(int[] array, int n){
    for(int i = 0; i<array.length; i += n){
      int left = i;
      int right = Math.max(i + n - 1, i);

      while (left < right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
        left++;
        right--;  
        
      }
    }

  }

  public static void main(String[] args){
    int[] array = {1, 3, 5, 7, 9, 11, 15, 17, 19};
    int n = 3;
    reverseInSubset(array, n);
    System.out.println("Reversed array subset of N: "+ Arrays.toString(array));
  }

}


/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 * 
 * Explanation:
 * 1. This solution uses a two-pointer technique to reverse the array in-place. The outer loop iterates over
 * the array in steps of n, where n is the size of the subset to be reversed.
 * 2. The inner while loop reverses the subset of size n starting from the current index i.
 * 3. The left and right pointers are used to swap elements in the subset.
 * 4. The time complexity is O(n) because we are iterating over the array once.
 * 5. The space complexity is O(1) because we are reversing the array in-place without using any additional
 * space.
 */