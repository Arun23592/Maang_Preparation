package Maang_Preparation.Amazon.DP;

import java.util.Arrays;

public class MinimumCoinChange {

  public int coinChange(int[] coins, int amount){
    //create DP array
    int[] dp = new int[amount + 1];
    // Initialize dp array with a value greater than any possible minimum
    Arrays.fill(dp, amount + 1);
    //base case to make 0
    dp[0] = 0;

    for(int coin: coins){
      for(int i = coin; i<= amount; i++){
        dp[i] = Math.min(dp[i], dp[i - coin] + 1);
      }
    }
    return dp[amount] > amount ? -1 : dp[amount];

  }



  public static void main(String[] args) {
    int[] coins = {1, 2, 5};
    int amount = 11;

    MinimumCoinChange change = new MinimumCoinChange();

    int result =  change.coinChange(coins, amount);

    System.out.println("Minimum coins needed: "+result);
  }

}


/*
 *Given a variety of coin types defining a currency system, find the minimum
 *number of coins required to express a given amount of money. Assume an
 *infinite supply of coins of every type. 
 * 
 * Approach: Dynamic Programming
 * Time complexity: O(n*m) - > Where n is the amount to make and m is the number of different coin types.
 * Space complexity: O(n) - > The space needed to store the dp array.
 * 
 * Explanation:
 * 1. initialize the DP array
 * 2. For each coin, iterate over all possible amounts from the coins value to the target amount.
 * 3. Update DP array for each amount by taking the minimum of current value
 * 4. After processing all coins,  the value at dp[amount] will be the minium number of coins
 * needed to make the target amount.
 * 
 * Testcase:
 * 1. standard case:
 * Input: coins = [1, 2, 5], amount = 11
 * Output: 3 (5 + 5 + 1)
 * Edge case:
 * 2. No solution case:
 * return -1 if no target acheived
 * 3. Large amount case:
 * 
 * 
 * Interview Questions:
 * 1. Can you explain the problem you are trying to solve?
 * Answer: The problem is to find the minimum number of coins needed to make a given amount of money using an infinite supply of coins of specified denominations.
 * 2. What approach did you use to solve this problem?
 * Answer: I used a dynamic programming approach where I maintain a dp array to store the minimum number of coins required for each amount from 0 to the target amount.
 * 3. Why did you initialize the dp array with amount + 1?
 * Answer: I initialized the dp array with amount + 1 because the problem asks for the minimum number
 *  of coins needed to make the target amount, and the dp array will store the minimum number of coins
 *  needed for each amount from 0 to the target amount.
 * 4. Why is dp[0] initialized to 0?
 * Answer: dp[0] is initialized to 0 because we need 0 coins to make an amount of
 *  0. This is the base case for our dynamic programming approach.
 * 
 * Leetcode: 322. Coin Change
 * 
 */