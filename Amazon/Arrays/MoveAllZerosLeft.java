package Maang_Preparation.Amazon.Arrays;

import java.util.Arrays;

class MoveAllZerosLeft {

  public void moveZeros(int[] n){
    
      int start = n.length -1; 
      int end = n.length-1;

      while (end >= 0) {
        if (n[end] == 0) {
            end--;
        }else{
          int temp = n[end];
          n[end] = n[start];
          n[start] = temp;
          end--;
          start--;
        }
        
      
    }

    

  }

  public static void main(String[] args) {
    int[] n = {1, 0, 2, 0, 3, 0, 4};
    MoveAllZerosLeft zeros = new MoveAllZerosLeft();
    zeros.moveZeros(n);
    System.out.println(Arrays.toString(n));

  }
}


/*
 * Approach: Two Pointers technique thats swaps elements in the place
 * Time complexity: O(n) -> where n is the number of elementss
 * Space complexity: O(1) - > we have used fixed amount of extra space
 * 
 * 
 * Explanation: 
 * 1. Initalize two pointers
 * 2. iterate through the array
 * 3. if the element at the end pointer is 0, decrement the end pointer
 * 4. if the element at the end pointer is not 0, swap it with the element
 * 
 * Test case:
 * int[] n = {1, 0, 2, 0, 3, 0, 4};
 * output:  [1, 4, 2, 3, 0, 0, 0]
 * 
 * Edge:
 * 1. Non zero
 * 2. All zero
 * 3. Zeros at beggining
 * 4. Empty array
 * 
 * 
 * 
 */