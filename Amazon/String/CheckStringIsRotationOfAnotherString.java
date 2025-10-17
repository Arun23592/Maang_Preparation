package Amazon.String;

public class CheckStringIsRotationOfAnotherString {

  // Method to check if s2 is a rotation of s1
  public static boolean isRotation(String str1, String str2){

    // Check length equality and substring condition on concatenated string
    return (str1.length() == str2.length() && (str1+str2).contains(str1));
  }

  public static void main(String[] args) {
    String str1 = "abcde";
    String str2 = "cdeab";

    // Check rotation and print result
    boolean result = isRotation(str1, str2);
    System.out.println(result);
  }

}


/*
 * 
 * 
 * This implementation first checks whether both strings have the same length, and then checks if one is a substring of the other concatenated with itself.​

Time complexity is 
O(n)
O(n), making it efficient for interview settings.


Approach Implemented
The problem asks: Given two strings, are they rotations of each other? The most efficient and widely used approach is:

Concatenate the first string with itself.

Check if the second string is a substring of this concatenated result.

If str1 = "abcde", str1 + str1 = "abcdeabcde". If str2 = "cdeab", check if "abcdeabcde".contains("cdeab").

Space Complexity
O(n):

The concatenated string requires 
O(n)
O(n) extra space.


Step-by-Step Explanation:
Compare Lengths:

If str1.length() != str2.length(), return false immediately.

Concatenate:

Combine str1 with itself (e.g., "abcde" + "abcde" = "abcdeabcde").

Substring Check:

Check if str2 is a substring of the result.

Result:

If yes, str2 is a rotation of str1.

If no, it's not.
 * 
 * 
 */