package Maang_Preparation.Amazon.Arrays;

import java.util.HashSet;

public class FindDuplicatesArray {

  public static void duplicateArrays(int[] arr){
    HashSet<Integer> seen = new HashSet<>();
    HashSet<Integer> duplicates = new HashSet<>();

    for(int num : arr){
      if(seen.contains(num)){
        duplicates.add(num);
      }else{
        seen.add(num);
      }
    }

    if(duplicates.isEmpty()){
        System.out.println("No Duplicates found: ");
    }else {
      System.out.println("Duplicates found: "+duplicates);
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 2, 4, 5, 5,  3};
    duplicateArrays(arr);
    

  }

}


/*
 * Approach: the approach used here leverages two hashsets one to track the elements seen and one to track the duplicates
 * Time complexiy: O(n) -> We iterating through array once
 * Space complexity: O(1) -> This occurs if all the elements in the array are unique and we end up storing all of them in the seen set.
 * 
 * Explanations:
 * 1. Create HashSets --> seen and duplicates
 * 2. Iterate through array
 * 3. Check if the number is in the seen set
 *  4. If it is, add it to the duplicates set
 *  5. If it is not, add it to the seen set
 *  6. After the loop, check if the duplicates set is empty
 *  7. If it is, print that there are no duplicates
 *  8. If it is not, print the duplicates
 *  
 * Testcase:
 * 1. No duplicates
 * 2. One duplicate
 * 3. All duplicates
 * 4. mixed case
 * 5. single element
 * 
 * Edge case:
 * 1. Empty array
 * 2. Single element
 * 3. All unique elements
 * 
 * Interview Questions:
 * 1. Can you find duplicates without using extra space?
 * Answer: Yes, we can sort the array first and then check consecutive elements for duplicates. This will
 * reduce the space complexity to O(1) but increase the time complexity to O(n logn)
 * 
 *  
 * 
 * 
 * 
 */