package Maang_Preparation.Amazon.Arrays;

import java.util.ArrayList;
import java.util.*;;

public class MagicTriplets {

  public static List<List<Integer>> findMagicTriplets(int[] arr){
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(arr);

    for(int i = 0; i<arr.length-2; i++){
      if (i > 0 && arr[i] == arr[i - 1]) {
        continue;
      }

      int left = 0;
      int right = arr.length - 1;

      while (left < right) {
        int sum = arr[i] + arr[left] + arr[right];
      

      if (sum == 0) {
        result.add(Arrays.asList(arr[i], arr[left], arr[right]));
        left++;
        right--;

        while (left < right &&  arr[left] == arr[left - 1]) {
          left++;
        }

        while (left < right && arr[right] == arr[right - 1]) {
          right--;
          
        }
      }else if (sum < 0) {
        left++;
      }else{
        right--;
      }
      }
    }
  
    return result;

  }

  public static void main(String[] args) {
    int[] arr = {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> magicTriplets = findMagicTriplets(arr);

    System.out.println("Magic triplets: ");
    for(List<Integer> triplets: magicTriplets){
      System.out.println(triplets);
    }
  }
}
