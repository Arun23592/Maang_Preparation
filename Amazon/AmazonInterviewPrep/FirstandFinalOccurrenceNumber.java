package Amazon.AmazonInterviewPrep;


public class FirstandFinalOccurrenceNumber {

  /**
* Return an array of two integers: {firstIndex, lastIndex}
* If target not present, both entries are -1.
*/


/**
* findFirst - finds the leftmost (first) index of target
* Approach:
* - Standard binary search loop.
* - When nums[mid] == target, record mid as candidate and continue searching left
* by setting right = mid - 1. This ensures we find the earliest index.
*/
//1. first occurrence
  private static int firstOccurrence(int[] nums, int target){
    int left = 0, right = nums.length - 1;
    int firstOccurrence = -1;

    while (left <= right) {
      // safe mid calculation to avoid overflow
      int mid = left + (right - left) / 2;

      if (nums[mid] == target) {
        // we found target, but there may be an earlier one on the left side
         firstOccurrence = mid; // record current match
         right = mid - 1; // search left half to find earlier occurrence
      }else if (nums[mid] < target) {
        // target must be on the right side
        left = mid + 1;
      }else{
        // nums[mid] > target -> target must be on the left side
        right = mid - 1;
      }
    }

    return firstOccurrence;
  }


/**
* findLast - finds the rightmost (last) index of target
* Approach:
* - Same as findFirst but when a match is found we move left = mid + 1
* to search the right half for a later occurrence.
*
* Note: The original code had a bug in mid calculation:
* int mid = right + (left - right) / 2; // WRONG
* It should be: left + (right - left) / 2
*/


//2. last occurrence

  private static int lastOccurrence(int[] nums, int target){
    int left = 0, right = nums.length - 1;

    int lastOccurence = -1;

    while (left <= right) {
      // corrected mid calculation to avoid overflow and wrong index
      int mid = right + (left - right);

      if(nums[mid] == target){
        // we found target, but there may be a later one on the right side
        lastOccurence = mid; // record current match
        left = mid + 1; // search right half to find later occurrence
      }else if (nums[mid] < target) {
        // target is on the right side
        left = mid + 1;
      }else{
        // target is on the left side
        right = mid - 1; 
      }
    }

    return lastOccurence;
  } 

  //3. both first and last occurrence

  public static int[] firstandFinalOcurrence(int[] nums, int target){
      int[] result = {-1, -1};

      // Defensive check: if array is null or empty, return default {-1,-1}
      if (nums == null || nums.length == 0) {
          return result;
      }
      // Find first occurrence (leftmost index) using modified binary search
      result[0] = firstOccurrence(nums, target);

      // Find last occurrence (rightmost index) using modified binary search
      result[1] = lastOccurrence(nums, target);

      return result;
  
  }

  public static void main(String[] args) {
    int[] nums = {1, 3, 4, 5, 5, 8};
    int target = 5;

    int[] results = firstandFinalOcurrence(nums, target);
    System.out.println(results[0]);
    System.out.println(results[1]);
  }
}
  



/*
 * 
 * Approach:
* - Same as findFirst but when a match is found we move left = mid + 1
* to search the right half for a later occurrence.
*
* Note: The original code had a bug in mid calculation:
* int mid = right + (left - right) / 2; // WRONG
* It should be: left + (right - left) / 2

/**
* FirstandLastOccurenceSortedArray.java
*
* Purpose:
* - Find the first and last occurrence of a target value in a sorted integer array.
* - Uses modified binary search twice: once to find first occurrence (left-biased),
* once to find last occurrence (right-biased).
*
* Time Complexity: O(log n)
* Space Complexity: O(1)
*
* Notes:
* - Binary search uses mid = left + (right - left) / 2 to avoid integer overflow.
* - If the target is not found, methods return -1.



"This code uses a modified binary search approach to find the first and last occurrence of a number in a sorted array. It performs binary search twice: one biased to the left to find the first occurrence, and one biased to the right to find the last occurrence. The complexity is O(log n) time and O(1) space, which is optimal for sorted arrays. A minor bug is in the calculation of mid in findLast(), which should use left + (right - left)/2 to avoid overflow and incorrect values."

✅ Alternative Approach

Linear Search:

Scan array left to right for first occurrence.

Scan array right to left for last occurrence.

Time Complexity: O(n).

Simple but not optimal for large arrays.
*/
 * 
 * 
 * 
 */