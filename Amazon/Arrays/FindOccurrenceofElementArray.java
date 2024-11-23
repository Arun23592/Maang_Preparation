package Maang_Preparation.Amazon.Arrays;

import java.util.*;

public class FindOccurrenceofElementArray {

  public static Map<Integer, Integer> elementOccurrence(int[] array){
    Map<Integer, Integer> countMap = new HashMap<>();

    for(int element: array){
      if(countMap.containsKey(element)){
        countMap.put(element, countMap.get(element) + 1);
      }else{
        countMap.put(element, 1);
      }
    }

    return countMap;
  }


  public static void main(String[] args) {
    int[] nums = {1, 1, 2, 2, 2, 6, 5, 5, 5};

    Map<Integer, Integer> elementCount = elementOccurrence(nums);
    
    for(Map.Entry<Integer, Integer> eleEntry : elementCount.entrySet()){
      System.out.println(eleEntry.getKey() + "--> " + eleEntry.getValue());
    }
  }

}


/*
 * 
 */