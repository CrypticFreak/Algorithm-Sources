package javacodes.numbersystem;

/**
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * Created By Ankur Khurana
 */
public class ReverseInteger {
  public int reverseUsingLong(int n){
    if(n == 0)return n;
    int sign = n/Math.abs(n);
    n = sign*n;
    Long reverse = 0L;
    while(n > 0) {
      reverse = reverse*10 + n%10;
      n=n/10;
    }
    return (sign*reverse.intValue());
  }
}
