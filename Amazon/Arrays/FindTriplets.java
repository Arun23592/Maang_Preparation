package Amazon.Arrays;

public class FindTriplets {

  public static void main(String[] args){
    
    int[] arr = {1, 2, 3, 4, 5};
    int target = 9;

    boolean found = false;

    for(int i=0; i<arr.length-2; i++){
      for(int j=i+1; j<arr.length-1; j++){
        for(int k=j+1; k<arr.length; k++){
          if(arr[i] + arr[j] + arr[k] == target){
            System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
            found = true;
          }
        }
      }
    }

    if(!found){
      System.out.println("No triplet found");
    }
  }
  
}


/***
 * Approach: Brute Force
 * Alternate Approach: Two Pointers
 * Explanation: The brute force approach checks all combinations of triplets in the array to see if they sum to the target value. 
 * The time complexity is O(n^3) due to the three nested loops. 
 * An alternate approach using two pointers can reduce the time complexity to O(n^2) by first sorting the array and then using two pointers to find pairs that sum to the target minus the current element.
 * 
 * How do you optimize this code?
 * Answer: To optimize the code, we can sort the array and use a two-pointer technique.
 *  This reduces the time complexity from O(n^3) to O(n^2). 
 * After sorting, we can fix one element and use two pointers to find pairs that sum to the target minus the fixed element. 
 * This way, we avoid checking all combinations and can efficiently find triplets.
 * 
 * 
 */