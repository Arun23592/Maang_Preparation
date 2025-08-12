package Amazon.String;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

  public static String removeDuplicateString(String s){

    //1. Create LinkedhashSet to store count
    LinkedHashSet<Character> count = new LinkedHashSet<>();

    for(char c : s.toCharArray()){
      count.add(c);
    }

    //2. create StringBuilder to Build the resulting string
    StringBuilder result = new StringBuilder();

    for(char c: count){
      result.append(c);
    }

    //3. return the result to the string
    return result.toString();

  }

  public static void main(String[] args) {
    String s = "Programming";

    String outString = removeDuplicateString(s);
    System.out.println("Duplicate strings are removed: "+outString);
  }

}
