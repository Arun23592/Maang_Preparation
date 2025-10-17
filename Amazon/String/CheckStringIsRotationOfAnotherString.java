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
