package Maang_Preparation.Amazon.DP;

public class SellandBuyStock {

  public int maxProfit(int[] prices){

    if(prices == null || prices.length == 0){
      return 0;
    }

      int minPrice = Integer.MAX_VALUE;
      int maxProfit = 0;

      for(int price: prices){
        if(price < minPrice){
          minPrice = price;
        }else if (price - minPrice > maxProfit) {
          maxProfit = price - minPrice;
          
        }
      }
      return maxProfit;
    
  }



  public static void main(String[] args) {
    int[] prices = {7, 1, 5, 3, 6, 4};

    SellandBuyStock stock = new SellandBuyStock();
    int result = stock.maxProfit(prices);
    System.out.println("minium profit of selling and buying: "+result);
  }

}


/*
 * Approach: efficient algorithm and iterate through the list of prices
 * Time complexity: O(n) - We only iterate through the list of prices once.
 * Space complexity: O(1) - We use a constant amount of extra space for variables.
 * 
 * Explanation:
 * 1. intialize variable minPrice and maxProfit
 * 2. iterate through the list of prices
 * 3. if the current price is less than minPrice, update minPrice
 * 4. if the current price - minPrice is greater than maxProfit, update maxProfit
 * 5. return maxProfit
 * 
 * Testcase:
 * 1. Standard case
 * input: prices = [7, 1, 5, 3, 6, 4]
 * output: 5 (Buy at 1, sell at 6)
 * 
 * Edge case
 * 2. Decreasing price :
 * input: prices = [7, 6, 5, 4, 3, 1]
 * output: 0 (No profit possible)
 * 
 * 3. SIngle day:
 * prices = [5]
 * output: 0
 * 
 * Interview Preparation:
 * 1. Can you explain your approach to solving this problem?
 * Answer: I iterate through the list of prices, keeping track of the minimum price encountered so far and calculating the potential profit at each step. The maximum profit found during the iteration is returned.
 * 2. What edge cases did you consider while implementing your solution?
 * Answer: I considered edge cases such as an empty array, single element array, decreasing prices, and arrays where all elements are the same
 * 
 * 
 * 
 * 
 */