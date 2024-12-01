package Maang_Preparation.Amazon.String;
import java.util.*;;
public class FindDuplicatesString {

  public static Map<Character, Integer> duplicateString(String str){
   Map<Character, Integer> duplicatesMap = new HashMap<>();

   char[] chars = str.toCharArray();

   for(char c: chars){
    
      duplicatesMap.put(c, duplicatesMap.getOrDefault(c, 0) + 1);
   }

    Map<Character, Integer> mapDuplicate = new HashMap<>();
    for(Map.Entry<Character, Integer> entryMap : duplicatesMap.entrySet()){
      if(entryMap.getValue()>1){
        mapDuplicate.put(entryMap.getKey(), entryMap.getValue());
      }
    }
    
    return mapDuplicate;

  } 

  public static void main(String[] args){
    String str = "programming";
    Map<Character, Integer> entryMap = duplicateString(str);
    System.out.println("Duplicate characters and their counts:");
    for(Map.Entry<Character,  Integer> entry: entryMap.entrySet()){
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }

}


/*
 * Approach: HashMap
 * Time complexity: O(n)
 * Space complexity: O(n) + O(m) => O(n+m)
 * where m is the number of unique characters in the input string.
 *  O(n), where n is the length of the input string.
 * 
 * Explanation:
 * 1. intialize HashMap
 * 2. convert string into charArry
 * 3. iterate over char array and put each character into HashMap
 * 4. count the characters
 * 5. Filter duplicates
 * 6. return mapDuplicate
 * 
 * Edge case:
 * input = ""
 * output = {}
 * 
 * 
 * 
 * 
 * 
 */