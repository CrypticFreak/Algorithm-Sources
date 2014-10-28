package org.javaspa.array;

/**
 * Created by Ankur K on 5/18/14.
 * http://oj.leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicate {
  public int removeDuplicates(int[] A) {
    if(A.length == 0) return 0;
    int replacement = 0;
    for(int i=1; i< A.length; i++){
      if(A[i] != A[replacement]){
        replacement++;
        A[replacement] = A[i];
      }
    }
    return replacement+1;
  }
}