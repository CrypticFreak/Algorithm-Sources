package org.javaspa.numbersystem;

/**
 * Created by Ankur K on 7/18/14.
 */
public class SingleNumber2 {
  public int singleNumber(int[] A) {
    int ones = 0;
    int twos = 0;
    int not_threes = 0;
    for(int i=0; i<A.length; i++){
      twos |= ones & A[i];
      ones = ones^A[i];
      not_threes = ~(twos & ones);
      twos &= not_threes;
      ones &= not_threes;
    }
    return ones;
  }
}
