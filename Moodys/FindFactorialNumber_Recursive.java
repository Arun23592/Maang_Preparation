package Moodys;

public class FindFactorialNumber {

  public static int factorial(int number){
    if(number == 0 || number == 1)
        return 1;
    else
         return number * factorial(number - 1);
    
  }

  public static void main(String[] args) {
    int number = 100;
    System.out.println(factorial(number));
  }

}


/*
 * Explanation:
  Factorial of a number n (written as n!) is 1 * 2 * 3 * ... * n.

  For n = 5, the result is 1*2*3*4*5 = 120.


 * 
 */