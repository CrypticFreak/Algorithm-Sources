package org.javaspa.array;

/**
 * Created by annkur on 7/28/14.
 */
public class Stocks2 {
  public int maxProfit(int[] prices) {
    int sum = 0;
    for (int i = 1; i < prices.length; i++) {
      if(prices[i] > prices[i-1]){
        sum += prices[i] - prices[i-1];
      }
    }
    return sum;
  }
}