package Amazon.AmazonInterviewPrep;

import java.util.Arrays;

public class MergeTwoSortedArraysWithVacantSpots {

  public void merge(int[] nums1, int m, int[] nums2, int n){
    // i: last valid index in nums1
    int i = m - 1;
    // j: last index in nums2 
    int j = n - 1;
    // k: last overall index in nums1 (including vacant slots)
    int k = m + n - 1;  // last index of arr1 (with vacant spots)


       // Step 1: Merge from the back
    while (j >= 0) {
      // If nums1 still has valid elements AND its current is larger, place it
      if (i >= 0 && nums1[i] > nums2[j]) {
          nums1[k--] = nums1[i--];
      }else{
        // Otherwise place nums2's current element
        nums1[k--] = nums2[j--];
      }
    }
  }


  public static void main(String[] args) {
    int[] nums1 = {1, 3, 5, 7, 8, 9, 10, 0, 0, 0};
    int m = 7;
    int[] nums2 = {2, 4, 6};
    int n = 3;

    MergeTwoSortedArraysWithVacantSpots merged = new MergeTwoSortedArraysWithVacantSpots();
    merged.merge(nums1, m, nums2, n);
    System.out.println(Arrays.toString(nums1));
  }

}


/**
 * 🧠 Problem (restated)

You have two sorted arrays:

nums1 of size m + n where only the first m elements are valid; the last n slots are vacant (placeholders).

nums2 of size n (all valid).

Goal: Merge nums2 into nums1 in sorted order, in place, using the vacant slots at the end of nums1.


✅ Approach (three pointers from the end)

If you merge from the front, you risk overwriting elements in nums1 that you still need to compare.
So we merge from the back:

i → index of the last valid element in nums1 (m - 1)

j → index of the last element in nums2 (n - 1)

k → index of the last position in nums1 (m + n - 1) where we place the largest next element

At each step, compare nums1[i] and nums2[j], put the larger one at nums1[k], and move that pointer (and k) left.
When nums2 is exhausted, we’re done; any leftover in the valid prefix of nums1 is already in the correct place.


⏱️ Time & 📦 Space Complexity

Time: O(m + n) — each element is moved at most once.

Space: O(1) — in-place merge; no extra arrays.

⚠️ Edge Cases

n == 0 (second array empty): do nothing, nums1 unchanged.

m == 0 (first array has only vacant slots): copy all elements from nums2.

Duplicates across arrays: handled naturally.

Negative numbers: handled (comparison works the same).

Placeholders are not necessarily zero: Your logic does not rely on zeros; it relies on m and n, which is correct.

nums1 must have size m + n. If not, you’ll get out-of-bounds.


🔁 Alternative Approaches (when in place isn’t required)

New result array:
Two forward pointers (i, j), one result pointer (k). Time O(m+n), Space O(m+n).

Copy & sort:
Copy nums2 into the vacant tail of nums1, then Arrays.sort(nums1).
Simple but slower: O((m+n) log(m+n)), still in place.


 * 
 * 
 * 
 */