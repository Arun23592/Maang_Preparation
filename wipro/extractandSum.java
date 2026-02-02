package wipro;

public class extractandSum {


  public static String extractAndSum(String str){


    StringBuilder result = new StringBuilder();

    char[] ch = str.toCharArray();


    int num = 0;

    int sum = 0;

    int i = 0;

    for(char c: ch){
      if(Character.isLetter(c)){
        result.append(c);
      }else if (Character.isDigit(c)) {
        num = num * 10 + (c - '0');
        
        if(i == str.length() - 1 || !Character.isDigit(str.charAt(i+1))){
          sum += num;
          num = 0;
        }
        
      }

      i++;
    }

    return result.toString() + " " + sum;

  }

  public static void main(String[] args) {
    String str = "A45r5u50n";
    String sum = extractAndSum(str);
    System.out.println(sum);
  }

}
