package javacodes.array;

/**
 * Created by Ankur K on 5/13/14.
 * http://oj.leetcode.com/problems/maximum-subarray/
 * Accepted : Yes
 */

public class Kadane {
  public int maxSubArray(int[] A) {
    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for(int i=0; i<A.length; i++){
      currentSum += A[i];
      maxSum = Math.max(maxSum, currentSum);
      currentSum = Math.max(0, currentSum);
    }
    return maxSum;
  }
}
