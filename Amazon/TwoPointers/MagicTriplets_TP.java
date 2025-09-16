package Amazon.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicTriplets_TP {

  public static List<List<Integer>> findMagictripletsTp(int[] arr){

    List<List<Integer>> result = new ArrayList<>();

    //step 1: sort the array so we can use two-pointer and skip duplicates easily
    Arrays.sort(arr);
    //step 2: Fix one element arr[i], then find a pair arr[left] and arr[right] such that sum == 0
    for(int i=0; i<arr.length - 2; i++){

      //2a) if the value is same as previous, skip to avoid duplicate triplets
      if(i>0 && arr[i] == arr[i - 1]) continue;

      //2b)Two pointers for the subarray to the right i
      int left = i + 1;
      int right = arr.length - 1;

      //3 move pointer until they meet
      if(left < right){
        int sum = arr[i] + arr[left] + arr[right];

          //3a) Found a triplet
          if (sum == 0) {
            result.add(Arrays.asList(arr[i], arr[left], arr[right]));

            //3b) Advance left to the next different number (skip duplicates)
            while(left < right && arr[left] == arr[left + 1]) left++;
            //3c) Move right to the previous different  number (skip duplicates)
            while(left < right && arr[right] == arr[right - 1]) right++;

            left++;
            right--;


          }

          else if(sum < 0){
            left++;
          }
          else{
            right--;
          }
      }

    }
    // 4) Return all found unique triplets
    return result;

  }


  public static void main(String[] args) {
    int[] arr = {-1, 0, 1, 2, -1, -4};

    List<List<Integer>> triplets = findMagictripletsTp(arr);

    System.out.println("Magic triplets sum == 0: ");
    for(List<Integer> triplet: triplets){
      System.out.println(triplet);
    }
  }

}


/*
 * 
 * 
 * ✅ Step-by-step approach:

Sort the array – makes it easier to avoid duplicates and use two-pointer technique.

Fix one element (say arr[i]), then try to find two numbers such that:


arr[i]+arr[left]+arr[right]=0

Use two pointers:

left = i+1

right = n-1

Move them inward based on sum:

If sum = 0 → store the triplet.

If sum < 0 → move left++ (to increase sum).

If sum > 0 → move right-- (to decrease sum).

Skip duplicates to avoid repeated triplets.


👉 This approach works in O(n²) time, much better than brute force O(n³).
 * 
 * 
 */