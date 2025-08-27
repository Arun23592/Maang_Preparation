package Amazon.AmazonInterviewPrep;

import java.util.Arrays;

public class MinimumNumberOfCoinsChange {

  public static int minimumCoinChange(int[] coins, int amount){
    //1. initialize with amount+1(a large number means "not possible").
      int max = amount + 1; 

      //2. create dp array of size amount + 1, 
      int[] dp = new int[amount + 1];

      //3. Fill dp with "infinity"(meaning: not reachable yet)
      Arrays.fill(dp, max);

      //Base case case: if dp[0] = 0, then its 0
      dp[0] = 0;

      //4. For each coin try to improve all amounts i > = coin
      for(int coin: coins){
        for(int i=coin; i<=amount; i++){
          //if we can make (i-coin), then we can make i by adding this coin
          dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        }
      }

      //if the amount is still infinity or impossible then return -1;
      return dp[amount] > amount ? - 1 : dp[amount];
  }


  public static void main(String[] args) {
    int[] coins = {1, 2, 5};
    int amount = 11;
    System.out.println("Minium coins required: "+ minimumCoinChange(coins, amount) +" to make up this amount "+amount);

    int[] coins2 = {1, 2, 5, 6, 7};
    int amount2 = 200000000;
    System.out.println("Minium coins required: "+ minimumCoinChange(coins2, amount2) +" to make up this amount "+amount2);

    int[] coins3 = {2};
    int amount3 = 3;
    if (minimumCoinChange(coins3, amount3) == -1) {
      System.out.println("Minium coins required is not possible: "+ minimumCoinChange(coins3, amount3) +" to make up this amount "+amount3);
    }
    


  }

}


/*
 * 
 * 	
 * Given a variety of coin types defining a currency system, find the minimum
	  number of coins required to express a given amount of money. Assume an infinite supply of coins of every type

Problem: You are given coins of different denominations and a total amount. Find the minimum number of coins that make up that amount. If it’s not possible, return -1.

1, 2, 5 & target amount = 11 --> 1+2+2+2+5
1, 2, 5 & target amount = 11 --> 1+2+2+2+2+2
1, 2, 5 & target amount = 11 --> 1+5+5


Idea:
dp[x] = minimum number of coins to make amount x.
Initialize with a big number (“impossible”), set dp[0]=0, then relax transitions:
dp[i] = min(dp[i], dp[i - coin] + 1).


Approach (Step by Step)

We’ll use Dynamic Programming (Bottom-Up):
	1.	Create a dp array of size amount + 1.
	•	dp[i] = minimum coins to make amount i.
	•	Initialize with amount+1 (a large number, means “not possible”).
	2.	Base case: dp[0] = 0 (zero coins needed to make amount 0).
	3.	For each coin, try to build up the solution for every amount from coin → amount.
  4. Formula:
      dp[i] = Math.min(dp[i], dp[i - coin] + 1)
  	5.	At the end, if dp[amount] is still large, return -1. Else return dp[amount].

Complexity
	•	Time Complexity: O(amount * number_of_coins)
	•	Space Complexity: O(amount)

Edge Cases
	1.	amount = 0 → return 0
	2.	No solution possible (e.g. coins = [2], amount = 3) → return -1
	3.	Large amount with small coins → should still work.

Alternative Approaches
	1.	Recursive + Memoization → Easier to write but less efficient for very large amount.
	2.	Greedy (always pick largest coin first) → Doesn’t always give optimal solution (fails for coins like [1, 3, 4], amount = 6).

  This DP solution is optimal, clean, and interview-friendly.

  Bottom-up DP: fastest in practice, iterative, easy to integrate.

  What is Bottom-Up Approach?

The bottom-up approach is a way of solving problems by starting from the simplest subproblems (base cases) and gradually building solutions to larger problems.

Instead of recursion (top-down with memoization), we iteratively fill up a DP table/array, where each entry represents the solution to a smaller subproblem.



 */