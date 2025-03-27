package Maang_Preparation.Amazon.Arrays;

import java.util.Arrays;

class MoveAllZerosEnd {

  public void moveZeros(int[] n){
    
     int position = 0;

     for(int i = 0; i<n.length; i++){
      if(n[i] != 0){
        int temp = n[i];
        n[i] = n[position];
        n[position] = temp;
        position++;
      }
     }
    }      
    //  // Fill the remaining positions with zeros
    //  while (position < n.length) {
    //   n[position] = 0;
    //   position++;
    //  }
      
    // }

    

  

  public static void main(String[] args) {
    int[] n = {1, 0, 2, 0, 3, 0, 4};
    MoveAllZerosEnd zeros = new MoveAllZerosEnd();
    zeros.moveZeros(n);
    System.out.println(Arrays.toString(n));

  }
}


/*
 * Approach: Two Pointers technique thats swaps elements in the place
 * Time complexity: O(n) -> where n is the number of elementss
 * Space complexity: O(1) - > we have used fixed amount of extra space
 * 
 * Explanation:
 * 1. We have two pointers, one at the beginning of the array and one at the end.
 * 2. We iterate through the array, and whenever we encounter a non-zero element, we swap it with the
 *  element at the position of the first pointer. We then increment the first pointer.
 * 3. If we encounter a zero, we simply move to the next element.
 * 4. Once we have iterated through the entire array, the first pointer will be at the position where the
 *  non-zero elements should be, and the rest of the array will be filled with zeros.
 * 5. We then fill the remaining positions with zeros.
 * 6. Finally, we return the modified array.
 * 7. The time complexity is O(n) because we are iterating through the array once, and the space complexity
 * 8. is O(1) because we are using a fixed amount of extra space.
 * 
 * Testcase:
 * int[] n = {1, 0, 2, 0, 3, 0, 4};
 * // Output: [1, 2, 3, 4, 0, 0, 0]
 * 
 * Edge case:
 * 2. Non zerros
 * 3. All zeros
 * 4. Zeros at the begining
 * 5. Empty array
 * 
 * Interview questions:
 * 
 * 1. How would you handle moving zeros to the beginning instead of the end?
 * Answer: You can use a similar approach but iterate from right to left and swap non-zero elements to the left
 * 2. What if the array contains negative numbers or other data types?
 * Answer: The current approach works regardless of the values of the non-zero elements, including negative numbers.
 * 
 * 
 */