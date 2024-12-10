package Maang_Preparation.Amazon.String;

public class ReverseString {

  public void reverseString(char[] s){
    
    int left = 0;
    int right = s.length - 1;

    while (left < right) {
      char temp = s[left];
      s[left] = s[right];
      s[right] = temp;
      left++;
      right--;
    }
  }


  public static void main(String[] args) {
    String s = "H,a,n,n,a,h";
    char[] chars = s.toCharArray();
    ReverseString rev = new ReverseString();

    rev.reverseString(chars);
    String result = new String(chars);
    System.out.println("Reversed String: "+result);

  }

}
