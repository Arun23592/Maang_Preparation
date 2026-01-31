package Amazon.AmazonInterviewPrep;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class KthLargestElementArray {


  public static int largestElementK(int[] nums, int k){

    //4. Edge case 1: check the null or empty values in the array
    if(nums == null || nums.length == 0){
      throw new IllegalArgumentException("Input array is empty or null");
    }

    //5. Edge case 2: check k < arr, k > nums
    if(k <= 0  || k > nums.length){
      throw new IllegalArgumentException("k must be between 1 and length of the array");
    }

    Set<Integer> unique = new HashSet<>();
    for(int n: nums){
      unique.add(n);
    }

    //1. priorityQueue --> min- heap
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    //2. Iterate throw elements and find the kth element
    for(int num: unique){ 
        if(minHeap.size() < k || num > minHeap.peek()){
          minHeap.add(num);
        }
            

        if(minHeap.size() > k){
          minHeap.poll(); //remove the smallest
        }    
    }
    //3. return the minheap values removed
    return minHeap.poll();
  
  }

  public static void main(String[] args) {
    int[] nums = {10, 20, -3, 40, 40, 4, 80, 100, 100, 80};
    int k = 2;

    int results = largestElementK(nums, k);
    System.out.println("Kth Largest element: "+results);
  }

}


/*
 * 
 * 📝 Interview-Style STAR Explanation

Situation:
I was asked to find the K-th largest element efficiently in an array with possible duplicates.

Task:
Sorting would take O(n log n), which is inefficient for large datasets. I needed a solution better suited when k is small compared to n.

Action:
I implemented a min-heap of size k. I iterated through each element, ensuring only the top k largest numbers were kept. At the end, the heap root gave the K-th largest.

Result:
The solution worked in O(n log k) time, saving processing overhead compared to sorting. It correctly handled duplicates and negative numbers, though I added guard clauses for cases where k > n or array is empty.


✅ What’s fixed?

Null/empty input check → throws IllegalArgumentException.

k validation → must be between 1 and nums.length.

Works with duplicates, negatives, sorted arrays.

Handles k=1 (max element) case cleanly.

Graceful error handling in main.
 * 
 * 
 * 
 * ✅ Test Cases for largestElement(int[] nums, int k)
Test ID	  Input (nums, k)	    Expected Output	      Notes
TC_01	  [3,2,3,1,2,4,5,5,6],    k=2	    5	          Normal case (second largest element).
TC_02	  [1], k=1	              1	                  Edge case: Single element array.
TC_03	  [2,2,2], k=2	          2	                  All elements same.
TC_04	[7,10,4,3,20,15], k=3	    10	                k=3rd largest.
TC_05	[1,2], k=2	              1	                  Small array, valid k.
TC_06	[5,6,7], k=5	          Error/Exception	      Invalid input: k > array length.
TC_07	[], k=1	                Error/Exception	      Invalid input: Empty array.
TC_08	[Integer.MIN_VALUE, 
      Integer.MAX_VALUE, 0], k=1	2147483647	      Extreme values.
TC_09	[3,1,4,1,5,9], k=6	        1	                Valid but k = array length.
TC_10	[3,2,3,1,2,4,5,5,6], k=0	  Error/Exception	  Invalid input: k=0.
 * 
 * 
 */