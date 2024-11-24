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
