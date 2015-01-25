package javacodes.codechef.july14;

import java.util.Scanner;

/**
 * Created by Ankur K on 7/6/14.
 */
class ReachThePoint {
  static public void main(String []args){
    Scanner sc = new Scanner(System.in);
    int numTests = sc.nextInt();

    while(numTests > 0){
      int total = 0;
      int x = sc.nextInt();
      int y = sc.nextInt();
      int minnum = Math.min(x,y);
      total = total + minnum * 2;
      x = x - minnum;
      y = y - minnum;
      if(x == 0){
        System.out.println(total + (y/2)*4 + y%2);
      }
      else {
        System.out.println(total + (x/2)*4 + (x%2)*3);
      }
      numTests--;
    }
  }
}
