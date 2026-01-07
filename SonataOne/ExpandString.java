package SonataOne;

public class ExpandString {


  public static String stringExpansion(String str){
     //StringBuilder
  StringBuilder result = new StringBuilder();
  //find out the length
  int length = str.length();
  //iterate through the string
  for(int i=0; i<length; i++){
    char currentChar = str.charAt(i);     //currentChar to handle alphabets
    int count = 0;                        //store count

    while (i+1 < length && Character.isDigit(str.charAt(i+1))) {
      count = count * 10 + (str.charAt(++i) - '0');   //collect digits after the character
      
    }

    
      //append the  character count times
      for(int j=0; j<count; j++){
        result.append(currentChar);
      }


  }
  //return result 
    return result.toString();
  }


  public static void main(String[] args) {
    String str = "a2b3c4";

    String result = stringExpansion(str);
    System.out.println(result);
  }
 

}


//input: a2b3c4
//output: aabbbcccc

/**
 * Approach: using String builder or HashMap
 * 
 * 
 * 
 */