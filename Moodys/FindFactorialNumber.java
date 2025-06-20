package Moodys;

public class FindFactorialNumber {

  public static void main(String[] args) {
    int n = 5;
    long factorial = 1;

    for(int i=1; i<=n; i++){
      factorial *= i;
    }
    System.out.println("Factorial of "+ n + " is : " +factorial);
  }

}


/*
 * Explanation:
  Factorial of a number n (written as n!) is 1 * 2 * 3 * ... * n.

  For n = 5, the result is 1*2*3*4*5 = 120.


 * 
 */