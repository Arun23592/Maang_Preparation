package Maang_Preparation.Amazon.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedCharacters {

  public static char firstNonRepeatingCharacter(String input){

    input = input.toLowerCase().replaceAll("s\\+", "");

    Map<Character, Integer> countMap = new LinkedHashMap<>();


    for(char c: input.toCharArray()){
      countMap.put(c, countMap.getOrDefault(c, 0) + 1);
    }

    for(char c: input.toCharArray()){
      if (countMap.get(c) == 1) {
        return c;
        
      }
    }

    throw new RuntimeException("No non-repeated characters found");
  }


  public static void main(String[] args) {

    String input = "Is it your first company";
    try {
      char result = firstNonRepeatingCharacter(input);
      System.out.println(" Non-Repeated characters are: "+ result);
      
    } catch (RuntimeException e) {
      // TODO: handle exception
      System.out.println(e.getMessage());
    }
    
    
  }

}


/*
 * 
 * Time complexity: O(n), where n is the length of the string
 * Space complexity: O(n), We store the frequency of each character
 * Approach: create LinkedHashMap, This will store characters as keys and frequency as Values.
 * 
 * Explanation:
 * 1. Intialize LinkedHashMap
 * 2. Tranverse the string and populate the HashMap
 * 3. Find the Non-repeated characters
 * 
 */