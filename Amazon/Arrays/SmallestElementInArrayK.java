package Maang_Preparation.Amazon.Arrays;


import java.util.Collections;
// import java.util.Arrays;
import java.util.PriorityQueue;

public class SmallestElementInArrayK {

    public int largestElement(int[] nums, int k){
      PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

      for(int i = 0; i< nums.length; i++){
        if(maxHeap.size() < k){
          maxHeap.add(nums[i]);
        }else if (nums[i] < maxHeap.peek()) {
          maxHeap.poll();
          maxHeap.add(nums[i]);
          
        }
         
        
      }

      return maxHeap.peek();
      // Arrays.sort(nums);
      //   return nums[nums.length - k];
      
    }

    public static void main(String[] args){
      int[] nums = {3,2,3,1,2,4,5,5};
      int k = 2;
      LargestElementInArrayK obj = new LargestElementInArrayK();
      int sElement = obj.largestElement(nums, k);
      System.out.println("Second smallest element is: "+sElement);
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