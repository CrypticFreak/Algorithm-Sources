package org.javaspa.codechef.easy;

import java.util.Scanner;

/**
 * Created by Ankur K on 7/3/14.
 */
class DivideTheCake {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int numTests = sc.nextInt();
    while(numTests > 0){
      int test = sc.nextInt();
      StringBuilder string = new StringBuilder();
      if(360 % test == 0){
        string.append("y ");
      }
      else string.append("n ");
      if(test <= 360){
        string.append("y ");
      }
      else string.append("n ");

      if(test <= 26){
        string.append("y");
      }
      else string.append("n");
      System.out.println(string.toString());
      numTests--;
    }

  }
}
