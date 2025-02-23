public class PalindromeString {

  public static boolean panlindromes(String s){
    String str = s.toLowerCase();
    String st = str.replaceAll("[a-zA-Z0-9]", "");
    int left = 0;
    int right = st.length()-1;

    while (left < right) {
      if (st.charAt(left) == st.charAt(right)) {
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
