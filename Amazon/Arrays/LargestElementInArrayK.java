package Maang_Preparation.Amazon.Arrays;

// import java.util.Collection;
// import java.util.Collections;
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
      int k = 2;
      LargestElementInArrayK obj = new LargestElementInArrayK();
      int sElement = obj.largestElement(nums, k);
      System.out.println("Second largest element is: "+sElement);
    }

}


/*
 *Approach: The code finds the k-th largest element in an array using a min-heap (priority queue).
 * PriorityQueue<Integer> minHeap = new PriorityQueue<>();
 * The main idea of this solution is to use a min-heap with a maximum size of k. 
 * By doing this, we ensure that the smallest of the k largest elements is always on the top of the heap.
 * 
 * Time complexity: O(n log k) - >  Each insertion and deletion operation in a heap of size k takes O(log k) time. Since we perform these operations n times, the overall time complexity is O(n log k).
 * Space complexity: O(k) -> The space complexity is determined by the size of the min-heap, which holds at most k elements.
 * 
 * Explanation:
 *1. Create a min-heap with a maximum size of k. PriorityQueue<Integer> minHeap = new PriorityQueue<>();
 *2. Iterate through the each element of the array. for(int i = 0; i< nums.length;
 *3. Add element to the heap
 *4. Maintain the heap size to k.
 *5. Poll the heap to remove the smallest element if the heap size is greater than k.
 *6. After iterating through all elements, the top of the heap will be the k-th largest
 *7. element. return minHeap.poll();
 *
 * 
 * Interview Questions:
 * 1. Why did you use a min-heap instead of a max-heap?
 * Answer: A min-heap is used to find the k-th largest element because it allows us to easily remove
 *  the smallest element (which is the k-th largest element) from the top of the heap.
 * 2. Can you solve this problem using sorting?
 * Answer: Yes, we can solve this problem by sorting the array in descending order and then
 *  returning the k-th element. However, this approach has a time complexity of O(n log n
 *  which is worse than the O(n log k) time complexity of the heap-based approach.
 * 3. How does the priority queue (min-heap) ensure efficient insertion and deletion?
 * Answer: The priority queue (min-heap) ensures efficient insertion and deletion by maintaining
 *  the heap property, which states that the parent node is either greater than (in a max-
 *  heap) or less than (in a min-heap) its child nodes. This property allows
 *  us to insert and delete elements in O(log k) time.
 * 4. What edge cases did you consider while writing this code?
 * Answer: Edge cases include:
 * k being 1 (smallest largest element).
 * k equal to the length of the array.
 * Arrays with all identical elements.
 * Arrays where k is larger than the number of unique elements.
 * 
 * 
 */