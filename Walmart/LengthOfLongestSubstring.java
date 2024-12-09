package Maang_Preparation.Walmart;

import java.util.HashMap;
import java.util.Map;



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
    }
  public static void main(String[] args) {
      String s = "pwwkew";
      LengthOfLongestSubstring subString = new LengthOfLongestSubstring();
      int result = subString.lengthOfLongestSubstring(s);
      System.out.println("Longest subtring: "+result);
    }

}



/*
 * Approach: This a classic sliding window problem where we use two pointers(left and right) to maintain a window of characters with no duplicates.
 *  
 * Time complexity: O(n) -> Each character is processed at most twice (once by right and possibly once by left), making the time complexity linear with respect to the length of the input string.
 * Space complexity: O(min(n, m)) -> In the worst case, we might need to store all characters in
 * the map, where n is the length of the string and m is the size of the character set
 * 
 * Explanation:
 * 1. Initialize maximumLength and HashMap
 * 2. Sliding window
 * 3. Return result
 * 
 * Test case:
 * 1. basic test:
 * input: "pwwkew"
 * output: 3
 * 2. All unique characters
 * input: "abcdef"
 * output: 6
 * 3. No unique characters
 * input: "aaaaaa"
 * output: 1
 * 4. Mixed characters
 * input: "abcabcbb"
 * output: 3
 * 5. String with special characters
 * Input: "a!b@c#d$"
 * Output: 8
 * 
 * Edge cases:
 * 1. Empty String
 * input: ""
 * output: 0
 * 2. Single character
 * input: "a"
 * output: 1
 * 3. String with spaces
 * input: "abc abc"
 * output: 4
 * 4. String with numbers and characters
 * input: "abc123abc"
 * output: 6
 * 
 * 
 * 
 */