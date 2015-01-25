package javacodes.dp;


/**
 * Created by Ankur K on 5/9/14.
 * Question : You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Online Judge : http://oj.leetcode.com/problems/climbing-stairs/
 * Accepted : Yes
 *
 */
public class ClimbStairs {
  public int climbStairs(int n) {
    int[] stairResult = new int[n+1];
    stairResult[0] = 1;
    stairResult[1] = 1;

    for(int i = 2; i<= n; i++ ){
      stairResult[i] = stairResult[i-1] + stairResult[i-2];
    }
    return stairResult[n];
  }
}
