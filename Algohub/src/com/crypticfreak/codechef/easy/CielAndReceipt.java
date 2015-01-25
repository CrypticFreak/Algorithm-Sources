package javacodes.codechef.easy;

import java.util.Scanner;

/**
 * Created by Ankur K on 7/2/14.
 */
class CielAndReceipt {
  public static void main(String []args){
    Scanner in = new Scanner(System.in);
    int numTests = in.nextInt();
    int price, power;
    while(numTests > 0)
    {
      price = in.nextInt();
      power = price/2048;
      price %= 2048;
      while(price > 0)
      {
        power += price%2;
        price=price/2;
      }
      System.out.println(power);
      numTests--;
    }
  }
}
