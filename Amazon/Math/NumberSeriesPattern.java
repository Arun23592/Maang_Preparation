package Amazon.Math;

public class NumberSeriesPattern {

  public static void main(String[] args) {
    int n = 5;

    for(int i=1; i<=n; i++){
      System.out.print("1");
      for(int j=2; j<=i; j++){
        for(int k=1; k<=j; k++){
          System.out.print(j);
        }
      }
      System.out.println();
    }
  }

}

/*
 * 
 * Time Complexity
O(n²): Due to nested looping.

Space Complexity
O(1): No extra data structures, outputs directly.

Edge Cases
n = 0 ⇒ Nothing should print.

n < 0 ⇒ Should handle gracefully (no output or validation).

Interview Follow-ups
How to print the pattern as a single string?

Modify pattern for different input requirements.
 * 
 * 
 */