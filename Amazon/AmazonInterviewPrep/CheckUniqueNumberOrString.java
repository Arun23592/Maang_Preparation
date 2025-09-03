package Amazon.AmazonInterviewPrep;

import java.util.HashSet;

public class CheckUniqueNumberOrString {

  public static boolean hasUniqueNumber(long number){
    //1. convert int to string
    String numStr = String.valueOf(number);
    //2. store into Set -> HashSet
    HashSet<Character> seen = new HashSet<>();
    for(char ch: numStr.toCharArray()){
      if (seen.contains(ch)) {
          return false;
      }
        seen.add(ch);
    }
    //3. return true if no duplicates
    return true;
  }


  public static void main(String[] args) {
    System.out.println(hasUniqueNumber(983107564L));
  }
}


/*
 * 
 * 
 * ✅ Approach 1 (Optimal & Easiest – Use a Set)

Convert the number to a string (to easily loop over digits).

Use a HashSet to track seen digits.

If we encounter a digit that already exists → return false.

If loop completes → return true.


✅ Time & Space Complexity

Time Complexity: O(n) → where n = number of digits.

Space Complexity: O(n) (for HashSet, at most 10 digits).


✅ Approach 2 (Optimal with Constant Space – Boolean Array)

Since digits are only 0–9, we can use a boolean array of size 10 instead of HashSet.


✅ Edge Cases to Handle

Leading Zeros (if string input) → "00123" should be treated properly.

As string → leading zeros preserved.

As integer → zeros lost, but logic still works.

Very large numbers (use String instead of long).

Negative numbers → either reject or take absolute value.


Interview Follow-ups

What if instead of digits, the string can contain letters too?
→ Extend logic to check uniqueness in full ASCII range.

What if you want to find the first duplicate digit?
→ Modify to return the digit instead of just false.

What if asked without extra space?
→ Sort digits and check adjacent duplicates → O(n log n) time, O(1) extra space.
 */