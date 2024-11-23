package Maang_Preparation.Amazon.Arrays;

import java.util.HashMap;
import java.util.Map;

public class NonEmptySubArray {

  public static int[] findZeroSumSubArray(int[] nums){

    Map<Integer, Integer> sumMap = new HashMap<>();

    int sum = 0;

    for(int i=0; i<nums.length; i++){
      sum += nums[i];
      if(sum == 0){
        return new int[]{0, i};
      }

      if(sumMap.containsKey(sum)){
        return new int[]{sumMap.get(sum) + 1, i}; 
      }

      sumMap.put(sum, i);
    }
    return null;
  }

  public static void main(String[] args) {
    int[] nums = {4, 2, 1, -3, 6};
    int[] result = findZeroSumSubArray(nums);

    if (result != null) {
      System.out.println("Zero-sum subarray found from index " + result[0] + " to " + result[1]);
  } else {
      System.out.println("No zero-sum subarray found.");
  }
}
  
}
