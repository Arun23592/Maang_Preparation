package Maang_Preparation.Walmart;

import java.util.HashMap;
import java.util.Map;

import Maang_Preparation.Amazon.String.LongestSubstring;

public class LengthOfLongestSubstring {

  public int lengthOfLongestSubstring(String s){
      int maximumLength = 0;

      Map<Character, Integer> visitedCharacters = new HashMap<>();

      for(int left=0, right=0; right<s.length(); right++){
        char currentCharacters = s.charAt(right);
        if(visitedCharacters.containsKey(currentCharacters) &&
        visitedCharacters.get(currentCharacters) >= left){
          left = visitedCharacters.get(currentCharacters) + 1;
        }
        maximumLength = Math.max(maximumLength, right - left + 1);
        visitedCharacters.put(currentCharacters, right);
      }

      return maximumLength;

  public static void main(String[] args) {
      String s = "pwwkew";
      LengthOfLongestSubstring subString = new LengthOfLongestSubstring();
      int result = subString.lengthOfLongestSubstring(s);
      System.out.println("Longest subtring: "+result);
    }

}
