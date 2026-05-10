package Amazon.AmazonInterviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NonEmptySubarrayWithSumZero_Hashmap {

  public static List<List<Integer>> nonEmptySubArray(int[] arr){
    //1. Store prefixsums in an HashMap.
    Map<Integer, List<Integer>> prefixMap = new HashMap<>();
    List<List<Integer>> result = new ArrayList<>();

    //2. sum of elements from start to current position
    int sum = 0;

    //3. iterate through each number in the array
    for(int i=0; i<arr.length; i++){
      sum += arr[i];

      //Case 1: prefix sum is 0
      if(sum == 0){
        result.add(Arrays.stream(arr, 0, i+1).boxed().toList());

      }

      //Case 2: prefix sum seen before
      if(prefixMap.containsKey(sum)){
        for(int start: prefixMap.get(sum)){
          result.add(Arrays.stream(arr, start+1, i+1).boxed().toList());
        }
      }


      //store prefix sum and index in the map
      prefixMap.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
    }

    return result;

  
  }


  public static void main(String[] args) {
    int[] arr = {3, 4, -7, 1, 2, -6};

   List<List<Integer>> subarrays = nonEmptySubArray(arr);
   System.out.println("Zero-sum subarrays: " + subarrays);
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