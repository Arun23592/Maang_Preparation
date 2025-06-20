package Moodys;

public class CompareTwoStrings {

  public static void main(String[] args) {
    String str1 = "Moody";
    String str2 = "Moo*y";

    str2 = str2.replace("*", "d");

    if (str1.equals(str2)) {
        System.out.println("Success");
    }else{
      System.out.print("Failure");
    }
  }

}
