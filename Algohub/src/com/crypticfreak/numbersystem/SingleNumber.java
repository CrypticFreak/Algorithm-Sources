package javacodes.numbersystem;

/**
 * Created by Ankur K on 5/7/14.
 */

/* This Class gives a single number out of a given array. All elements are dupliacte, instead of one.
 * http://oj.leetcode.com/problems/single-number/
 * This uses the property that
 * Declare an Array
 * String[] myStringArray = new String[3];
 * String[] myStringArray = {"a","b","c"};
 * String[] myStringArray = new String[]{"a","b","c"};
*/
public class SingleNumber {
  public int singleNumber(int[] A)
  {
    int result = 0;
    for(int i=0;i<A.length; i++)
    {
      result = result ^ A[i];
    }

    return result;
  }
}
