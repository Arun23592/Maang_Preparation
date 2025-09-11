package Amazon.AmazonInterviewPrep;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatedCharacterInString {

  public static List<Character> firstNonRepeatedCharacter(String input){
    //Edge case: 
     if (input == null || input.isEmpty()) {
        return null;
     }

    //1. count the frequency using LinkedHashMap
    Map<Character, Integer> freqMap = new LinkedHashMap<>();

    String output = input.toLowerCase();
    
    for(char ch: output.toCharArray()){
      if(ch != ' '){
        freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
      }
      
    }

    //2. Find the character with count equal to 1.
    List<Character> nonRepeatCharacters = new ArrayList<>();
    for(Map.Entry<Character, Integer> entry: freqMap.entrySet()){
      if(entry.getValue() == 1){
        nonRepeatCharacters.add(entry.getKey());
      }
    }

    //3. return non-repeated characters
    return nonRepeatCharacters;
  }

  public static void main(String[] args) {
    String input = "Is it your first company";

    List<Character> results = firstNonRepeatedCharacter(input);

    if (!results.isEmpty()) {
      System.out.println("All Non-Repeated character is: "+results.get(1));
    }else{
      System.out.println("Non-Repeated characters not found: ");
    }
  }

}


/*
 * 
 * Write a program to print the first non-repeated char in a string. e.g. A string “Is it your first company” returns ‘u’.
 * 
 * ✅ Complexity

Time Complexity: O(N) → two passes over the string.

Space Complexity: O(1) if ASCII (max 256 chars), else O(K) for unique characters.

✅ Edge Cases

Input string is null → return null.

Input string is empty → return null.

All characters are repeated → return null.

Example: "aabbcc".

String with one character → return that character.

Example: "z".

Case sensitivity → "aA" → output "a". (can normalize if interviewer asks).


✅ Interview Follow-ups

Ignore case sensitivity? Convert string to lowercase before processing.

Ignore spaces/punctuation? Already ignoring spaces; can extend to skip punctuation.

What if asked for k-th non-repeated character? Modify loop to count until k-th.

Can you solve in one pass? Yes → use queue approach:

Push char into queue when seen first.

Remove if repeated.

Queue front always has first non-repeated char.


✅ Alternative (Queue-based approach for streaming input)

This is especially asked in interviews for stream of characters (like reading from a file/socket).

Would you like me to also give you the queue-based one-pass streaming solution (since interviewers love it as a follow-up)?
 */