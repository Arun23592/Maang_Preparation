package Amazon.String;

public class ReverseWordsInString {

  public String reverseWords(String str){
    String[] s = str.trim().split("\\s+");
    String rev = "";
    for(int i = s.length-1; i>=0; --i){
        rev += s[i] + " ";
    }

    return rev + s[0];
  }


  public static void main(String[] args) {
    String str = "the sky is blue";
    ReverseWordsInString revWords = new ReverseWordsInString();
     String result = revWords.reverseWords(str);
     System.out.println("Reverse String:"+result);
    
  }

}
