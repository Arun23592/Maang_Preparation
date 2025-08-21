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
