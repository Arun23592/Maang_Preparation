public class PalindromeString {

  public static boolean panlindromes(String s){
    int left = 0;
    int right = s.length()-1;

    while (left < right) {
      if (s.charAt(left) == s.charAt(right)) {
          left++;
          right--;
        
      }else{
        return false;
      }
      
    }
    return true;
  }
    public static void main(String[] args) {
      String s = "Madam";
      System.out.println("\nIs this palindrome: "+panlindromes(s));
      

    }
}
