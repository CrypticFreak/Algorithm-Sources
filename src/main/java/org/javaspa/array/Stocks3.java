package org.javaspa.array;

/**
 * Created by annkur on 7/28/14.
 * https://oj.leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
 */
public class Stocks3 {
  public int maxProfit(int[] prices) {
    int result = 0;
    int maxfal = 0;
    for(int i=1;i<prices.length;i++){
      if(prices[i-1] < prices[i]){
        result += prices[i] - prices[i-1];
      } else {
        maxfal = Math.max(maxfal, prices[i-1]-prices[i]);
      }
    }

    return result + maxfal;
  }
}