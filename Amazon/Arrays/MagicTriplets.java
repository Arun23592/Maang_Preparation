package Amazon.Arrays;

import java.util.ArrayList;
import java.util.*;;

public class MagicTriplets {

  public static List<List<Integer>> findMagicTriplets(int[] arr){
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(arr);

    for(int i = 0; i<arr.length-2; i++){
      if (i > 0 && arr[i] == arr[i - 1]) {
        continue;
      }

      int left = 0;
      int right = arr.length - 1;

      while (left < right) {
        int sum = arr[i] + arr[left] + arr[right];
      

      if (sum == 0) {
        result.add(Arrays.asList(arr[i], arr[left], arr[right]));
        left++;
        right--;

        while (left < right &&  arr[left] == arr[left - 1]) {
          left++;
        }

        while (left < right && arr[right] == arr[right - 1]) {
          right--;
          
        }
      }else if (sum < 0) {
        left++;
      }else{
        right--;
      }
      }
    }
  
    return result;

  }

  public static void main(String[] args) {
    int[] arr = {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> magicTriplets = findMagicTriplets(arr);

    System.out.println("Magic triplets: ");
    for(List<Integer> triplets: magicTriplets){
      System.out.println(triplets);
    }
  }
}


/*
 * Approach: we can use a two-pointer approach after sorting the array. This approach ensures that we efficiently find triplets without missing any possible combinations.
 * 
 * Time complexity: O(n^2)->  Sorting the array takes O(n log n) time, and finding triplets takes O(n^2) time in the worst case.
 * Space complexity: O(1) -> No extra space is used other than a few variables for indexing and holding results.
 * 
 * Explanation:
 * 1. Sort the array: Arrays.sort(arr); and initalize list of list with ArrayList.
 * 2. Iterate through the array: use two pointers to find the pairs that sum up to -ve elements.
 * 3. Use two pointers:  Initialize two pointers, one starting just after the current element and the other starting from the end of the array.
 * 4. Check for the triplets: If the sum of the current element and the elements at the two
 * pointers is equal to the current element, add the triplet to the result list and move the pointers
 *  accordingly.
 * 
 * Test case:
 * 1. basic test case:
 * Input: arr = [-1, 0, 1, 2, -1, -4]
 * Output: [[-1, -1, 2], [-1, 0, 1]]
 * 2. Array with no triplets
 * Input: arr = [1, 2, 3, 4, 5]
 * Output: []
 * 3. Array with multiple triplets
 * Input: arr = [-2, 0, 1, 1, 2, -1, -4, 3, 0}
 * Output: [[-4, 1, 3], [-2, -1, 3], [-2, 0, 2], [-1, -1, 2], [-1, 0, 1]]
 * 4. Array with all zeros
 * Input: arr = [0, 0, 0, 0]
 * Output: [0, 0, 0, 0]
 * 5. Array with positive and negative numbers
 * Input: arr = [1, 2, 3, 4, 5]
 * Output: [0, 0, 0]
 * Input: arr = [-1, -2, -3, -4,  -5]
 * Output: [0, 0, 0]
 * 
 * Edge case:
 * 1. Empty Array
 * 2. Array with Less than Three Elements
 * 2. Array with Large numbers
 * 
 * Interview Questions:
 * 1. Can you solve this problem without sorting the array?
 * Answer: Solving this problem without sorting would generally lead to higher time complexity. Sorting helps to efficiently use the two-pointer approach to find the triplets.
 * 2. How does the two-pointer technique work in this solution?
 * Answer: After sorting, for each element, the two-pointer technique is used to find pairs whose sum equals the negative of the current element, ensuring that the sum of the three elements is zero. The pointers move towards each other to cover all possible pairs.
 * 3. How can you optimize the solution further?
 * Answer: The solution is already optimized for finding triplets in O(n^2) time. Further optimization would likely involve advanced data structures or parallel processing but would complicate the implementation.
 * 
 * 
 * 
 */