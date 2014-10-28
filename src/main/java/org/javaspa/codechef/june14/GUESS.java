package org.javaspa.codechef.june14;

import java.util.Scanner;

/**
 * Created by Ankur K on 6/9/14.
 */
class RationalNum{
  long num;
  long denum;
  public RationalNum(long num, long denum){
    long gcd = findGcd(num, denum);
    this.num = num/gcd;
    this.denum = denum/gcd;
  }
  private long findGcd(long a, long b){
    if(a%b == 0)return b;
    return findGcd(b, a%b);
  }

  @Override
  public String toString() {
    return num + "/" + denum;
  }
}

public class GUESS {

  public static RationalNum findProbability(long alice, long bob){
    long aliceOdd,aliceEven,bobOdd,bobEven;

    aliceOdd = ((alice + 1) /2);
    bobOdd = ((bob + 1) /2);
    aliceEven = (alice/2);
    bobEven = (bob/2);
    return new RationalNum(aliceEven*bobOdd + aliceOdd*bobEven, alice*bob);
  }

  public static void main(String []args){
    Scanner in = new Scanner(System.in);
    int numTests = in.nextInt();
    for(int i=0;i<numTests;i++){
      long alice = in.nextLong();
      long bob = in.nextLong();
      System.out.println(findProbability(alice, bob));
    }
  }
}
