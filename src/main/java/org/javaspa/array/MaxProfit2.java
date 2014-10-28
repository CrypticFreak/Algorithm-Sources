package org.javaspa.array;

/**
 * Created by Ankur K on 5/18/14.
 * http://oj.leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class MaxProfit2 {
  public int maxProfit(int[] prices) {
    int result = 0;
    for(int i=1; i<prices.length; i++){
      if(prices[i] - prices[i-1] > 0)
      {
        result = result + prices[i] - prices[i-1];
      }
    }
    return result;
  }
}