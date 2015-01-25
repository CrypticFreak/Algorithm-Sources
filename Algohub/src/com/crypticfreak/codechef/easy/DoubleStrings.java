package javacodes.codechef.easy;

import java.util.Scanner;

/**
 * Created by Ankur K on 7/1/14.
 */
class DoubleStrings {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int numTests = sc.nextInt();
    while(numTests > 0){
      int temp  = sc.nextInt();
      int ans = temp - temp%2;
      System.out.println(ans);
      numTests--;
    }
  }
}
