package Maang_Preparation.Amazon.LexographicalPerrmutation;

import java.util.Arrays;

public class NextPermutation {

  public static void nextPermutation(int[] nums){
    if (nums == null || nums.length <= 1) {
      return;
    }

    //1.ind the right most eleemnt
    int i = nums.length - 2;
    while (i >= 0 && nums[i] >= nums[i + 1]) {
      i--;
    }

    //2. if right most element found, then find successor
    if(i>=0){
      int j = nums.length - 1;
      while(nums[j] <= nums[i]){
        j--;
      }
      swap(nums, i, j );
    }

    reverse(nums, i+1, nums.length-1);
  }


  public static void reverse(int[] nums, int start, int end){
    while (start < end) {
      swap(nums, start, end);
      start++;
      end--;
    }
  }


  public static void swap(int[] nums, int i, int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
    
  }
public static void main(String[] args) {
  int[] sequence = {1, 2, 3};
  nextPermutation(sequence);
  System.out.println("Next permutation: "+Arrays.toString(sequence));

  sequence = new int[]{3, 2, 1};
  nextPermutation(sequence);
  System.out.println("Next permutation: "+Arrays.toString(sequence));

  sequence = new int[]{1, 1, 5};
  nextPermutation(sequence);
  System.out.println("Next permutation: "+Arrays.toString(sequence));

  sequence = new int[]{1, 3, 2};
  nextPermutation(sequence);
  System.out.println("Next permutation: "+Arrays.toString(sequence));

}

}
