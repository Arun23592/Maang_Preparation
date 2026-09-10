package Amazon.AmazonInterviewPrep;

public class countFactors {

  public static int countFactor(int N){
    if(N<=0) return 0;

    int count = 0;
    for(int i=1; i * i <= N; i++){
      if(N % i == 0){
        count++;
        if(i != N /i){
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int N = 36;
    System.out.println(countFactor(N));
  }
}


/***
 * 
 * 
 * 
 * 
 * Given an integer N, determine the total number of factors (divisors) of N efficiently.
 * 
 * 
 * 
 * 
 * 
 */