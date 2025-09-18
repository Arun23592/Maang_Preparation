package Amazon.AmazonInterviewPrep;

import java.util.HashSet;
import java.util.Set;

public class NonEmptySubarrayWithSumZero {

  public static boolean nonEmptySubArray(int[] arr){
    //1. Store prefixsums in an Hashet.
    Set<Integer> seen = new HashSet<>();

    //2. sum of elements from start to current position
    int prefixSum = 0;

    //3. iterate through each number in the array
    for(int num: arr){
      //update prefixsum
      prefixSum += num;

      //if prefixSum == 0 --> subarray with sum 0 exists and
          //seen.contains(prefixSum)

      if(prefixSum == 0 || seen.contains(prefixSum)){
        //return true
        return true;
      }

       //seen.add(prefixSum)
       seen.add(prefixSum);

    }
        
    //return false
    return false;
  }


  public static void main(String[] args) {
    int[] arr = {3, 4, -7, 1, 2, -6};

    if (nonEmptySubArray(arr)) {
      System.out.println("Zero-sum subarray exists");
    }else{
      System.out.println("No Zero-sum subarray");
    }
  }

}


/*
 * 
 * 
 * 
 * 👉 Problem Statement:
Given an array of integers, check if there exists a non-empty subarray whose sum = 0, and return one such subarray if possible.

Approach (Optimal using Prefix Sum + HashSet)

Maintain a prefix sum as we iterate.

Store prefix sums in a HashSet.

If prefix sum is repeated OR prefix sum = 0 at any point → subarray with sum 0 exists.


Complexity

Time: O(n) → single pass with prefix sum.

Space: O(n) → HashSet stores prefix sums.



Edge Cases

Single 0 in array → subarray = [0].

Negative numbers included.

Large arrays → works efficiently.



Interview Follow-ups

Q: How to return the subarray instead of just true/false?

Store prefix sum → index mapping in HashMap.

Q: What if you want count of all zero-sum subarrays?

Use Map<prefixSum, count> instead of Set.


 * 
 * 
 */