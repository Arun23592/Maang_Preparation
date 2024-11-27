package Maang_Preparation.Amazon.Math;

public class PalindromeNumber {

  public boolean isPalindrome(int x){
    if(x < 0 || (x % 10 == 0 && x != 0)){
      return false;
    }

    int reversed = 0;
    int original = x;

    while (x != 0) {
      int digit = x % 10;
      reversed = reversed * 10 + digit;
      x /= 10;
    }
    return original == reversed;
  }

  public static void main(String[] args) {
    int num = 121;
    int num2 = -121;
    int num3 = 10;
    int num4 = 12124;
    PalindromeNumber palindromeNumber = new PalindromeNumber();

    System.out.println(num + "is a palindrome: "+palindromeNumber.isPalindrome(num));
    System.out.println(num + "is a palindrome: "+palindromeNumber.isPalindrome(num2));
    System.out.println(num + "is a palindrome: "+palindromeNumber.isPalindrome(num3));
    System.out.println(num + "is a palindrome: "+palindromeNumber.isPalindrome(num4));
  }

}


/*
 * Approach: Reversing the Entire Number and check if the reversed number is equal to the original number.
 *           If they are the same, then the number is a palindrome.
 * Time complexity: O(d) - > d is the number of digits in the given integer.
 * Space complexity: O(1) - > constant space complexity. We only use a few variables for storing intermediate results.
 * 
 * Explanation:
 * 1. Handle special cases:
 *  If the integer is negative, it is not a palindrome.
 *  If the integer is a single digit, it is always a palindrome.  
 * 2. Reverse the number
 * 3. Compare the Reversed Integer with the Original Integer:
 * 
 * Test case: 
 * 1. Positive Palindrome: 121
 * 2. Negative Number: -121
 * 3. Single Digit: 10
 * 4. Non-Palindrome: 12124
 * 
 * Edge cases:
 * 5. Zero: 0
 * 6. Negative Non-Palindrome: -123
 * 7. Large Positive Palindrome: 12345654321
 * 8. Large Negative Non-Palindrome: -12345654321
 * 9. Large Single Digit: 9
 * 10. Large Non-Palindrome: 12345654321
 * 11. Large Zero: 0
 * 
 * Interview Questions:
 * 1. Why do you check if the number is negative or ends with zero?
 * Answer: Negative numbers are not palindromes because of the negative sign. Positive numbers that end with zero cannot be palindromes (except zero itself) because the reverse would start with zero, which is not allowed in integer representation.
 * 2. Can this solution handle very large integers?
 * Answer: Yes, as long as the integer fits within the range of the int type in Java. If handling numbers larger than the int range, you would need to use a different data type like long or even BigInteger.
 * 3.  How would you modify your approach to handle floating-point numbers or strings?
 * Answer: For strings, convert the string to a character array and use two-pointer technique to compare characters from the start and end. For floating-point numbers, handle the integer and fractional parts separately, ensuring both parts read the same backward and forward.
 * 
 * 
 * 
 */