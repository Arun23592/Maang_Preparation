

public class FindDuplicateNumber {

  public int findDuplicate(int[] nums){
    int left = 1;
    int right = nums.length - 1;
    int duplicate = -1;

    // Count how many numbers are less than or equal to mid
    while(left <= right){
      int mid = left + (right - left) / 2;

      int count = 0;
      for(int num: nums){
        if(num <= mid){
          count++;
        }
      }
    

    //if count is more than mid, it means duplicates in the left half
    if(count > mid){
      duplicate = mid;
      right = mid - 1;
    }else {
      left = mid + 1;
    }
    }
    return duplicate;
  }

  public static void main(String[] args){
    FindDuplicateNumber findDuplicate = new FindDuplicateNumber();
    int[] nums = {1, 3, 4, 2, 2};
    System.out.println("Duplicate number: "+findDuplicate.findDuplicate(nums));

    int[] nums2 = {3, 1, 3, 4, 2};
        System.out.println("Duplicate number in nums2: " + findDuplicate.findDuplicate(nums2)); // Output: 3

        int[] nums3 = {3, 3, 3, 3, 3};
        System.out.println("Duplicate number in nums3: " + findDuplicate.findDuplicate(nums3)); // Output: 3

  }

}

/*
 * Binary Search Algorith : We perform a binary search on the range of numbers (not the array indices).
For each midpoint mid of the current range [left, right], we count how many numbers in the array are less than or equal to mid.
 * 
 * Time Complexity: O(n log n), where n is the length of the array. The binary search runs in O(log n) and for each iteration, we count elements in O(n).
Space Complexity: O(1), as we only use a constant amount of extra space regardless of the input size.
 * 
 * Explanation
Initialization:

We initialize two pointers, left to 1 and right to nums.length - 1 (since the values are in the range [1, n]).
Binary Search:

We perform a binary search on the range of numbers (not the array indices).
For each midpoint mid of the current range [left, right], we count how many numbers in the array are less than or equal to mid.
Count Comparison:

If the count of numbers less than or equal to mid is greater than mid, it implies that the duplicate number must be in the range [left, mid]. Therefore, we update right to mid - 1.
Otherwise, the duplicate number must be in the range [mid + 1, right]. Therefore, we update left to mid + 1.
Finding the Duplicate:

The duplicate number will be found when left is equal to right. The variable duplicate keeps track of the midpoint that caused the count to be greater than mid, which is the duplicate number.
 * 
 */