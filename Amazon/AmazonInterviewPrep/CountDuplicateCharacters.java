package Amazon.AmazonInterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharacters {

// Method to count duplicate characters
  public static void main(String[] args) {
    String input = "programming";

     // Step 1: Use HashMap to store frequency of each character
    Map<Character, Integer> coutMap = new HashMap<>();

    // Step 2: Convert string to char array and count occurrences
    for(char ch: input.toCharArray()){
      coutMap.put(ch, coutMap.getOrDefault(ch, 0)+ 1);
    }

    // Step 3: Print only duplicates (frequency > 1)
    for(Map.Entry<Character, Integer> entry: coutMap.entrySet()){
      if (entry.getValue() > 1) {
        System.out.println(entry.getKey()+ "-->"+entry.getValue());
      }
    }
  }

}


/*
 * 
 * ✅ Complexity Analysis:

Time Complexity: O(n) → one pass through the string.

Space Complexity: O(k) → k is the number of unique characters.

✅ Edge Cases:


Empty String → No duplicates.

All unique chars (e.g., "abcd") → No output.

All same chars (e.g., "aaaa") → Single duplicate (a,4).

Case sensitivity: "Aaa" → A=1, a=2 (depends if interviewer wants case-insensitive).


✅ Interview Follow-ups:

How would you make it case-insensitive?
→ Convert string to lowercase before counting.

What if input has spaces or special chars?
→ Decide whether to ignore them or include in count.

What if we need the first duplicate only?
→ Track while iterating (stop when count reaches 2).


✅ Alternative Approach (Using Array for ASCII):

Since there are only 256 ASCII characters, you can use int[256] for frequency.

Faster than HashMap, but less flexible for Unicode.

public static void countDuplicatesWithArray(String input) {
    int[] freq = new int[256]; // ASCII size
    
    for (char ch : input.toCharArray()) {
        freq[ch]++;
    }
    
    System.out.println("Duplicate characters are:");
    for (int i = 0; i < 256; i++) {
        if (freq[i] > 1) {
            System.out.println((char)i + " -> " + freq[i]);
        }
    }
}
 * 
 * 
 */