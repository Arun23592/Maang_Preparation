package Maang_Preparation.Amazon.String;

import java.util.HashMap;
import java.util.Map;

public class FindOccurrenceOfCharacters {

  public static Map<Character, Integer> occurenceCharacter(String str){

    Map<Character,  Integer> mapCount = new HashMap<>();

    char[] chars = str.toCharArray();

    for(char ch: chars){
      if (ch == ' ') {
          continue;
      }
      if(mapCount.containsKey(ch)){
          mapCount.put(ch, mapCount.get(ch) + 1);
      }else{
        mapCount.put(ch, 1);
      }
    }
    return mapCount;



  }


  public static void main(String[] args) {
    String str = "Automation";
    //Print 
    Map<Character, Integer> charEntry = occurenceCharacter(str);

    for(Map.Entry<Character, Integer> entry : charEntry.entrySet()){
      System.out.println("(" + entry.getKey() + " , " + entry.getValue() +  ")");
    }
  }
}



/*
 * APproach:  HashMap
 *  Time complexity: o(n)
 * space complexity: O(m) + O(n) => O(n+m)
 * 
 */