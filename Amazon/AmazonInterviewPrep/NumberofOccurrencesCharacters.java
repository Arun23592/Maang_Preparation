package Amazon.AmazonInterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class NumberofOccurrencesCharacters {


  public static Map<Character, Integer> numberOfOccurence(String input){

    Map<Character, Integer> countChar = new HashMap<>();

    for(char ch: input.toCharArray()){
      countChar.put(ch, countChar.getOrDefault(ch, 0)+1);
    }

    return countChar;
  }


  public static void main(String[] args) {
    String input = "programming";

    //count all characters
    Map<Character, Integer> results = numberOfOccurence(input);
    System.out.println(results);


  }

}



/*
 * 
 * ✅ Problem

Write a script to print the number of occurrences of either:

A given character in a string, OR

The frequency of all characters in the string.

🔹 Approach 1: Using HashMap (Optimal & Easy to Explain)

👉 Best choice in interviews:

Time Complexity: O(n) (scan string once).

Space Complexity: O(k) where k is the number of unique characters.


🔹 Edge Cases

Empty String: "" → return 0 or {}.

Null Input: Handle with a check → return 0 or {}.

Special Characters & Spaces: "a a b!" → include them in count unless interviewer asks to ignore.
Example: {a=2, =2, b=1, !=1}.

Case Sensitivity: "Hello" → {H=1, e=1, l=2, o=1}.

If interviewer asks for case-insensitive, convert string to lowercase first.


🔹 Interview Follow-ups

Q: How would you make it case-insensitive?
Convert string to lowercase/uppercase before counting.

Q: Can you do it without extra space?

Yes, but that would mean O(n²) time (checking counts by scanning repeatedly).

HashMap is better (O(n) time, O(k) space).

Q: What if you need sorted output by frequency?
Use a PriorityQueue or sort the Map entries.

🔹 Alternative Approaches

Using Array (if only lowercase letters a–z):
Use an integer array of size 26 for counting → O(1) access.

Using Streams (Java 8+):
Can solve with Collectors.groupingBy() (but HashMap is simpler to explain in interviews).
 * 
 * 
 * 
 */