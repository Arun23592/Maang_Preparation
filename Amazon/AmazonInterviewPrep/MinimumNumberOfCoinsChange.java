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

  }

}


/*
 * 
 * 	Given a variety of coin types defining a currency system, find the minimum
	number of coins required to express a given amount of money. Assume an
infinite supply of coins of every type

1, 2, 5 & target amount = 11 --> 1+2+2+2+5
1, 2, 5 & target amount = 11 --> 1+2+2+2+2+2
1, 2, 5 & target amount = 11 --> 1+5+5
 */