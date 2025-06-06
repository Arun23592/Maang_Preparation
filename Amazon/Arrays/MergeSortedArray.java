package Maang_Preparation.Amazon.Arrays;

import java.util.Arrays;

public class MergeSortedArray {

  public void merge(int[] nums1, int m, int[] nums2, int n){
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;

    while(j >= 0){
      if(i >= 0 && nums1[i] > nums2[j]){
        nums1[k--] = nums1[i--];
      }else{
        nums1[k--] = nums2[j--];
      }
    }
  }

  public static void main(String[] args){
    int[] nums1 = {1, 3, 5, 0, 0, 0};
    int m = 5;
    int[] nums2 = {2, 4, 6};
    int n = 3;
    MergeSortedArray mergeSortedArray = new MergeSortedArray();
    mergeSortedArray.merge(nums1, m, nums2, n);

    System.out.println("Merge sorted array: "+ Arrays.toString(nums1));
  }

}


/*
 * Approach: Use three pointers approach
 * Time Complexity: O(n+m) -> We iterate through both lists at once.
 * Space Complexity: O(1) -> Merging is done in place without using extra space.
 * 
 * Explanation:
 * 1. Initialize three pointers: i for nums1, j for nums2, and k for the result array
 * 2. Compare the elements at the current positions of nums1 and nums2. If the element in nums1 is greater, copy it to the result array and move the pointer in nums1 one step to the
 * left. Otherwise, copy the element from nums2 to the result array and move the pointer in
 *  nums2 one step to the left.
 * 3. Repeat step 2 until we have processed all elements in nums2.
 * 4. At this point, the remaining elements in nums1 are already in the correct order
 * 5. Return the merged array
 * 
 * Edge cases:
 * 1. Single Element in Each Array
 * 2. Large k Value.
 * 3. Negative value
 * 
 * Interview Questions:
 * 1. Can you describe how the in-place merge is achieved?
 * Answer: The in-place merge is achieved by using the three pointers approach. We use the k pointer to keep
 *  track of the current position in the result array, and the i and j pointers to keep track of
 *  the current positions in nums1 and nums2 respectively. This way, we can merge the two
 * sorted arrays into the result array in place without using any extra space.
 * <By starting from the end of nums1 and filling it backwards, 
 * we ensure that we don't overwrite elements in nums1 that we still need to compare.>
 * 
 * 
 * 
 */