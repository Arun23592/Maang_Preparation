package Amazon.AmazonInterviewPrep;

public class BuyandSellStocks {

  public static int[] buyandsellStocks(int[] prices){

    if(prices == null || prices.length < 2){
      return new int[]{-1, -1};
    }

    int max_profit = 0;
    int buy_day = -1;
    int sell_day = -1;

    for(int i=0; i<prices.length-1; i++){
      for(int j=i+1; j<prices.length; j++){
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
    int[] prices = {100, 180, 260, 310, 40, 535, 695};
    int[] result = buyandsellStocks(prices);
    System.out.println(prices[result[0]] + " is a buying price " +result[0]  + " is  a buy day "+prices[result[1]]+ " is a selling price " + result[1]+ " selling day ");
  }


}


/*
 * 
 * 
 * .

👉 From interview perspective:

First explain the brute force (try all 2 transactions → O(n²) or worse).

Then optimize using prefix-suffix arrays (O(n)).

Finally, mention the Kadane-based O(1) DP solution (most efficient).

Question
	Given the daily prices of a stock, what’s the maximum possible profit one can
	generate by first buying one share of that stock on a certain day and then selling
	that share at least one day later?  -  Brute Force algorithm (AMAZON)

  Interview explanation:

“Brute force checks every possible buy and sell combination. For each day, I assume it is the buy day and compare it with every future day as the sell day.
 I calculate profit for each pair and store the maximum profit seen so far. This approach is simple but inefficient because it uses nested loops and takes O(n²) time.”

 * 
 */