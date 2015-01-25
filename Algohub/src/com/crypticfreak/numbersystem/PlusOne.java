package javacodes.numbersystem;

/**
 * Created by Ankur K on 5/9/14.
 * Question : Given a non-negative number represented as an array of digits, plus one to the number.
 * The digits are stored such that the most significant digit is at the head of the list.
 * Online Judge : http://oj.leetcode.com/problems/plus-one/
 * Accepted : Yes
 *
 * Recursive solution
 */
public class PlusOne {
  public int[] plusOne(int[] digits) {
    int length = digits.length;
    int carry = 1;
    for(int i = length - 1; i >=0 && carry > 0; i-- )
    {
      digits[i] += carry;
      carry = digits[i]/10;
      digits[i] %= 10;
    }
    if(carry > 0)
    {
      return addOneToStart(digits);
    }
    return digits;
  }

  private int[] addOneToStart(int[] digits)
  {
    int[] result = new int[digits.length + 1];
    result[0] = 1;
    for(int i = 1; i < result.length; i++)
    {
      result[i] = digits[i-1];
    }
    return result;
  }
}
