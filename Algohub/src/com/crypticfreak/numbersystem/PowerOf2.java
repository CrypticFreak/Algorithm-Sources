package javacodes.numbersystem;

/**
 * Created by annkur on 7/28/14.
 */
public class PowerOf2 {
   public boolean isPowerOfTwo(int num){
    int result = num & (num-1);
    return (result == 0);
  }
}
