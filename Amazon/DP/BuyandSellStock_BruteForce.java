package Amazon.DP;

public class BuyandSellStock_BruteForce {

  public static int[] buyandsellStock(int[] prices){
    if (prices == null || prices.length < 2) {
        return new int[]{-1, -1};
    }

    int max_profit = 0;
    int buy_day = -1;
    int sell_day = -1;

    for(int i=0; i<prices.length-1; i++){
      for(int j = i + 1; j<prices.length; j++){
        int profit = prices[j] - prices[i];
        if(profit > max_profit){
          max_profit = profit;
          buy_day = i;
          sell_day = j;
        }
      }
    }
    return new int[]{buy_day, sell_day};
  }





  public static void main(String[] args) {
    int[] prices = {100,180,260,310,40,535,695};
    int[] result = buyandsellStock(prices);
    System.out.println(result[0]+ " is buying date "+" and the price is "+prices[result[0]]+ ", " +result[1] + " is selling date"+ " and price is:  "+prices[result[1]]);
  }

}



/*
 * This question asked in Amazon QAE coding round:
 * Given a array of Stock Value rates of a company for each day, suggest best date for buying and best date for selling so that profit is huge.
 * For example {100,180,260,310,40,535,695}
 * Here answer is 4 and 6 where 4 is buying date and 6 is selling date.
 * 
 * 
 */

/*
 * Approach:  The brute force approach involves checking all possible pairs of days to find the combination that results in the maximum profit. This approach has a higher time complexity compared to the efficient one-pass algorithm.
 * Time complexity: O(n^2)-> The algorithm checks all pairs of days, resulting in quadratic time complexity.
 * Space complexity: O(1)-> The algorithm uses a constant amount of space to store the maximum profit.
 * 
 * Explanation:
 * 1. Initialize max_profit to 0,  buy_date=-1, sell_date = -1.
 * 2. Iterate through each pair of day (i) in the prices array. 
 * Calculate the profit for buying on day i and selling on day j.
 * If the profit is greater than max_profit, update max_profit, buy_day, and sell_day.
 * 3. Return buy_day and sell_day
 * 
 * Testcase:
 * Input: {100, 180, 260, 310, 40, 535, 695}
 * Output: Buy Day: 4, Sell Day: 6
 * 
 * Edge case:
 * 1. All Prices Decreasing
 * 2. Single Element or Empty Array
 * 3. Multiple Possible Answers
 * 
 * Interview Questions:
 * 1. How would you improve the efficiency of this brute force algorithm?
 * Answer: Use a one-pass algorithm that keeps track of the minimum price seen so far and the maximum profit seen
 * 2. How does the brute force approach help in understanding the problem before optimizing it?
 * 
 * 
 * Time Complexity = O(n)

Space Complexity = O(1)
 * 
 * 
 * 
 */