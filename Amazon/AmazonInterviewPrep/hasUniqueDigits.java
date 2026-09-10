package Amazon.AmazonInterviewPrep;

import java.util.HashSet;
import java.util.Set;

public class hasUniqueDigits {

  public static boolean hashUniqueDigits(String phoneNumber){
    Set<Character> setDigits = new HashSet<>();
    for(char digit: phoneNumber.toCharArray()){
      if (setDigits.contains(phoneNumber)) {
          return false;
      }
      setDigits.add(digit);
    }
    return true;
  }

  public static void main(String[] args){
    String phoneNumber = "1234567890";
    boolean result = hashUniqueDigits(phoneNumber);
    System.out.println("Does the phone number have all unique digits? " + result);
  }

}


/***
 * 
 * 
 * Given a phone number as a string or an integer, determine whether all the digits in the number are unique (i.e., no duplicate digits exist).
 * 
 * 🧩 Approach
Convert the number to a string (so we can iterate digit by digit).

Use a Set to track digits we’ve seen.

If a digit repeats → return false.

If we finish without duplicates → return true.


Time: O(n) → scans each digit once.

Space: O(1) → at most 10 digits stored in the set.


Interview‑Ready Closing Line
“I solved this by converting the number to a string and using a HashSet to track digits. If a digit repeats, I return false. This runs in O(n) time and O(1) space since there are only 10 possible digits.”
 * 
 * 
 * 
 */