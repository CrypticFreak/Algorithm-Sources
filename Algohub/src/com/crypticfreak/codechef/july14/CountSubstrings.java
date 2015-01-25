package javacodes.codechef.july14;

import java.util.Scanner;

/**
 * Created by ANKUR K on 7/5/14.
 */
class CountSubstrings {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int numTests = sc.nextInt();
    while(numTests > 0){
      int length = sc.nextInt();
      String binaryString = sc.next();
      long tillNow = 0;
      for(int i=0; i < length; i++){
        if(binaryString.charAt(i)=='1'){
          tillNow++;
        }
      }
      System.out.println((tillNow * (tillNow + 1L))/2L);
      numTests--;
    }
  }
}
