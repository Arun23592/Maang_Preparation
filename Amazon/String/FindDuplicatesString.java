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
