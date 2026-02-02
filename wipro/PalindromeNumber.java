package wipro;

public class PalindromeNumber {

  public static boolean numberPalindrome(int number){

    if(number < 0 || (number % 10 == 0 && number != 0)){
      return false;
    }

      int original = number;
      int reversed = 0;

      while (number > 0) {
        int digit = number % 10;
        reversed = reversed * 10 + digit;
        number = number / 10;
      }

      return original == reversed;

  }

  public static void main(String[] args) {
    int number = 212;
    boolean result = numberPalindrome(number);
    System.out.println(result);
  }

}
