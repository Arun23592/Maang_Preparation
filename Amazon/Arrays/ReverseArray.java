package Amazon.Arrays;

import java.util.*;
public class ReverseArray {

  public static void reverseanArray(int[] array){

    int left = 0;
    int right = array.length-1;

    while (left < right) {
      int temp = array[left];
      array[left] = array[right];
      array[right] = temp;
      left++;
      right--;
    }

    

  }


  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    //ReverseArray arr = new ReverseArray();
    reverseanArray(array);
    System.out.println("Reversed Array: "+Arrays.toString(array));
  }

}


/*
 * Approach: Traverse arrays - this approach entirely reverse the array
 * Time Complexity: O(n)
 * Space Compleity: O(1) - No additional space is required
 */