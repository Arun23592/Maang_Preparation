package Amazon.AmazonInterviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergekSortedArrays {

  //merge two sorted arrays
  private static int[] mergeTwoArrays(int[] arr1, int[] arr2){

    int i = 0, j =0;
    List<Integer> result = new ArrayList<>();

    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] <= arr2[j]) {
         result.add(arr1[i++]);
      }else{
        result.add(arr2[j++]);
      }
    }

    //append remaining arrays
    while (i < arr1.length) result.add(arr1[i++]);
    while (j < arr2.length) result.add(arr2[j++]);

    return result.stream().mapToInt(x -> x).toArray();
  }

  public static int[] mergeKSortedArrays(int[][] arrays, int start, int end){

      if (start == end) return arrays[start];

      int mid = (start + end) / 2;

      int[] left = mergeKSortedArrays(arrays, start, mid);
      int[] right = mergeKSortedArrays(arrays, mid+1, end);
      
      return mergeTwoArrays(left, right);
  }

  


  public static void main(String[] args) {
    int[][] arr = {{1, 3, 5, 7}, {2, 8, 6, -4}, {9, 10, 11}};

    for(int i=0; i<arr.length; i++){
      Arrays.sort(arr[i]);
    }

    int[] merged = mergeKSortedArrays(arr, 0, arr.length-1);
    System.out.println("Merged k sorted arrays are: "+Arrays.toString(merged));

  }

}


/*
 * Merge two sorted arrays:
 * 1.   MergeTwoArrays maintain with two pointer i, j 
 * 2.  collect merged number in ArrayList
 * 3. pick smaller front element each time and advance that pointer
 * 4. append the remaining arrays
 * 5. return the converted list
 * 
 * Merge k sorted arrays via Divide and Conquer
 * 1. split the range start to end into two halves
 * 2. Recursively merge the left half and the right half
 * 3. return the merged two sorted arrays
 * 
 * Complexity:
 * Time : O(T log k) = > O(N.k log k)
 * Time: O(T) for merged arrays and 0(log k)
 */