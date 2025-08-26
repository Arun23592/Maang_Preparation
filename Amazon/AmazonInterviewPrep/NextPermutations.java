package Amazon.AmazonInterviewPrep;

import java.util.Arrays;

public class NextPermutations {

  public static void nextPermutation(int[] nums){
    int n = nums.length;
    int i = n - 2;

    //step 1: Find the first decreasing element from the end
    while (i >= 0 && nums[i] >= nums[i+1]) {
      i--;
      
    }

    //step 2: if such elemen is found, find the next larger element to swap
    if (i >= 0) {
      int j = n - 1;
      while (nums[j] <= nums[i]) {
        j--;
      }
      swap(nums, i, j);
    }

    //step 3: reverse the remaining suffix.
      reverse(nums, i+1, n-1);
  }

  private static void swap(int[] nums, int i, int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  private static void reverse(int[] nums, int start, int end){
    while (start < end) {
      swap(nums, start++, end--);
    }
  }

  public static void main(String[] args) {

    int[] sequence = {1, 2, 3};
    nextPermutation(sequence);
    System.out.println("Next permutation: "+ Arrays.toString(sequence));
    
  }

}
