package Maang_Preparation.Amazon.Arrays;

import java.util.*;

public class TwoSum {

  public int[] findTwoSum(int[] nums, int target){

    Map<Integer, Integer> complements = new HashMap<>();

    for(int i =0; i<nums.length; i++){

      Integer complementIndex  = complements.get(nums[i]);
      if (complementIndex != null) {
        return new int[]{complementIndex, i};
      }
      complements.put(target - nums[i], i);
            
    }

    return nums;

  }
  

  public static void main(String[] args) {
    int[] nums = {6, 8, 11, 6, 7, 18};
    int target = 17;
    TwoSum sum = new TwoSum();
    int[] twoSum = sum.findTwoSum(nums, target);
    if (twoSum.length == 0) {
      System.out.println("No solution found");
    } else {
      System.out.println("Indices: " + twoSum[0] + ", " + twoSum[1]);
    }
  }
  
}5
