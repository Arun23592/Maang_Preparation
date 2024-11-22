package Maang_Preparation.Amazon.Arrays;

import java.util.Collection;
import java.util.Collections;
// import java.util.Arrays;
import java.util.PriorityQueue;

public class LargestElementInArrayK {

    public int largestElement(int[] nums, int k){
      PriorityQueue<Integer> minHeap = new PriorityQueue<>();

      for(int i = 0; i< nums.length; i++){
        if(minHeap.size() < k || nums[i] > minHeap.peek())
          minHeap.add(nums[i]);
        if(minHeap.size() > k)
          minHeap.poll();
          
        
      }

      return minHeap.poll();

      // Arrays.sort(nums);
      //   return nums[nums.length - k];
      
    }

    public static void main(String[] args){
      int[] nums = {3,2,3,1,2,4,5,5,6};
      int k = 6;
      LargestElementInArrayK obj = new LargestElementInArrayK();
      int sElement = obj.largestElement(nums, k);
      System.out.println("Second largest element is: "+sElement);
    }

}


/*Min-Heap
 * PriorityQueue<Integer> minHeap = new PriorityQueue<>();
 * The main idea of this solution is to use a min-heap with a maximum size of k. 
 * By doing this, we ensure that the smallest of the k largest elements is always on the top of the heap.
 * 
 * 
 * 
 * The main idea of this solution is to use a min-heap with a maximum size of k. By doing this, we ensure that the smallest of the k largest elements is always on the top of the heap.
 */