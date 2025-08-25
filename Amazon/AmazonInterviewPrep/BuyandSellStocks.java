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
