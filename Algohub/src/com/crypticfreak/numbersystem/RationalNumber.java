package javacodes.numbersystem;

/**
 * Created by annkur on 6/10/14.
 */
public class RationalNumber {

  int num;
  int denum;

  public RationalNumber(int num, int denum) {
    int gcd = findGcd(num, denum);
    this.num = num / gcd;
    this.denum = denum / gcd;
  }

  private int findGcd(int a, int b) {
    if (a % b == 0) return b;
    return findGcd(b, a % b);
  }
}