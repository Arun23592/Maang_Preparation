package Maang_Preparation.Amazon.String;

public class ReverseString2 {

  public static void main(String[] args){
    String str = "Arun Subramani";
    String RevStr = "";

    for(int i=str.length()-1; i >= 0; --i){
      RevStr = RevStr + str.charAt(i);

    }
    System.out.println("Reversed String: "+RevStr);
  }

}


/*
 * Approach: 
 * 1. Initialize
 * 2. Iterate
 * 3. Concatenate
 * 4. print output
 * 
 * Time complexity: O(n) -> Where n is the length of the input string. This is because the for loop
 * iterates through each character exactly once.
 * Space complexity: O(n) -> Because we are storing the reversed string in a new string variable.
 * 
 * Explanation:
 * 1. Initialize input string and create a variable to store  the reversed string
 * 2. Iterate through the string from the end to the start
 * 3. Concatenate each character to the reversed string
 * 4. Print the reversed string
 * 
 * Test case:
 * 1. Basic test
 * 2. Edge case: empty string
 * 3. Edge case: single character string
 * 4. Edge case: string with spaces
 * 5. Edge case: string with special characters
 * 6. Edge case: string with numbers
 * 7. Edge case: string with punctuation
 * 8. Edge case: string with multiple spaces
 * 9. Edge case: string with tabs
 * 10. Edge case: string with newline characters
 * 11. Edge case: string with carriage return
 * 
 * Interview  Questions:
 * 1. Can you implement the same functionality using a StringBuilder?
 * 2. How would you reverse the words in a sentence instead of the entire string?
 * 
 * 
 */