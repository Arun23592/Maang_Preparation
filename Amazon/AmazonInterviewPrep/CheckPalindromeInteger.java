package Amazon.AmazonInterviewPrep;


public class CheckPalindromeInteger {

  public static boolean isPalindromeNumber(int num){
     // Edge case: negative numbers are not palindrome
    if (num < 0) {
      return false;
    }

     // Edge case: negative numbers are not palindrome
    int originalNum = num;
    int reversed = 0;

    // Reverse the number
    while (num > 0) {
      int digit = num % 10;   // Extract last digit
      reversed = reversed * 10 + digit;  // Build reversed number
      num /= 10;  // Remove last digit
    }
    return originalNum == reversed;
  }

  public static void main(String[] args) {
    int num = 121;
    
    System.out.println(num +" is a Palindrome "+isPalindromeNumber(num));
    System.out.println(num +" is not a Palindrome "+isPalindromeNumber(num));
  }

}


/**
 * 
 * ✅ Problem

Given an integer, determine if it reads the same forward and backward.

Example:

121 → Palindrome

123 → Not Palindrome

-121 → Not Palindrome
 * 
 * 
 * 
 * Complexity

Time Complexity: O(log10(n)) → because we process each digit once.

Space Complexity: O(1) → only a few variables.


⚠️ Edge Cases

Negative numbers → not palindrome.

Single-digit numbers → always palindrome.

Numbers ending with 0 (except 0 itself) → not palindrome.
 */