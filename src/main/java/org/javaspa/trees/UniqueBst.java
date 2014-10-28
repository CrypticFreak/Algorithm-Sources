package org.javaspa.trees;

import java.util.ArrayList;

/**
 * Created by Ankur K on 5/9/14.
 * Question : Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 * Online Judge: http://oj.leetcode.com/problems/unique-binary-search-trees/
 * Test Cases Passed : yes
 * No Memoization, Add memoization
 */
public class UniqueBst {
  public int numTrees(int n) {
    if(n == 0) return 1;
    if(n == 1) return 1;
    int returnVal = 0;
    for(int i=0; i < n; i++ ){
      returnVal += numTrees(n-i-1)*numTrees(i);
    }
    return returnVal;
  }
}
