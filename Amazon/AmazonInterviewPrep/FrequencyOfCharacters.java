package Amazon.AmazonInterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

  //1. use HashMap
  //2. find the count of the characters


  public static void main(String[] args) {
    String input = "ababac";

    // Step 1: Create a HashMap to store char -> frequency
    Map<Character, Integer> freqMap = new HashMap<>();

    // Step 2: Traverse the string and update counts
    for(char ch: input.toCharArray()){
      freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
    }

    // Step 3: Print each character with its frequency
    for(Map.Entry<Character, Integer> entry: freqMap.entrySet()){
      System.out.println("(" +entry.getKey() + "," + entry.getValue()+")");
    }
  }

}


/*
 * 
 * ⚡ Complexity Analysis

Time Complexity:

O(n) → we traverse the string once.

Printing is O(k), but k ≤ n.

Space Complexity:

O(k) → HashMap stores at most k unique characters.


⚠️ Edge Cases to Consider

Empty string → return nothing.
Input: "" → Output: (empty).

All unique characters → each has frequency 1.
Input: "abcd" → (a,1)(b,1)(c,1)(d,1)

All same characters → one entry with count = length.
Input: "aaaa" → (a,4)

Mixed case sensitivity (depends on requirements).
Input: "aA" → treat separately (a,1)(A,1) unless told to ignore case.

🔀 Alternative Approaches

Using an Array (if only lowercase a–z allowed)

Create int[26] freq array.

Map ch - 'a' to index.

More space-efficient but less flexible.

Time: O(n), Space: O(26).

Using Java Streams (fancy but less interview-friendly)

Map<Character, Long> freqMap = input.chars()
    .mapToObj(c -> (char)c)
    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

 * 
 * 
 */