package Maang_Preparation.Amazon;

import java.util.*;

public class LongestSubstring {

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
    }

    public static void main(String[] args) {
      String s = "pwwkew";
      LongestSubstring subString = new LongestSubstring();
      int result = subString.lengthOfLongestSubstring(s);
      System.out.println("Longest subtring: "+result);
    }
}


//1. Implemented Slding Window algorithm and two pointers technique
//2. Initialize maximumLength and 