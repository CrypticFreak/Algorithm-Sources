package javacodes.codechef.june14;

import java.util.Scanner;

/**
 * Created by Ankur K on 6/9/14.
 */

public class CHEFZOT {
  public static void main(String []args){
    Scanner in = new Scanner(System.in);
    int numElements = in.nextInt();
    int currentStreak = 0;
    int maxStreak = 0;
    for(int i=0;i<numElements;i++){
      int current = in.nextInt();
      if(current == 0){
        currentStreak = 0;
      }
      else {
        currentStreak++;
        maxStreak = Math.max(currentStreak, maxStreak);
      }
    }
    System.out.println(maxStreak);
  }
}
