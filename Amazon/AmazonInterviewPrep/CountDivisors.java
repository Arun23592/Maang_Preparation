package Amazon.AmazonInterviewPrep;

public class CountDivisors {

  public static int countTheDivisors(int N){

    int count = 0;

    for(int i=1; i * i<= N; i++){
      if(N % i == 0){
        if (i == N/i) {
          count += 1;
        }else{
          count += 2;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int N = 12;
    System.out.println(countTheDivisors(N));
  }
}

/*
 * 
 * ✅ Time & Space Complexity

Time Complexity: O(√N) → very efficient compared to O(N).

Space Complexity: O(1) → only integer variables used.

✅ Edge Cases

N = 1 → only divisor is 1, return 1.

N = 0 → special case (technically infinite divisors, usually return 0 or throw exception).

Negative numbers → usually count factors of absolute value.

✅ Interview Follow-ups

What if asked to print all divisors instead of just count?

Store divisors while iterating and return list.

Careful to handle duplicates for perfect squares.

What if N is very large (up to 10^12)?

Still works in O(√N), which is feasible (~10^6 iterations).

What if asked for prime factorization instead of just divisor count?

Use trial division up to √N and store prime factors with their exponents.

Then use formula:


✅ Alternative Approach (Prime Factorization Formula)

Instead of brute counting, use prime factorization:

Example: N = 36 = 2^2 * 3^2
→ total divisors = (2+1) × (2+1) = 9

This is often considered most optimal if prime factorization is already available.
 * 
 * 
 */