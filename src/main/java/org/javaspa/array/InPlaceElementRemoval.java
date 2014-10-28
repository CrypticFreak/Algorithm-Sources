package org.javaspa.array;

/**
 * Created by Ankur K on 5/9/14.
 * Question : Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * Online Judge : http://oj.leetcode.com/problems/remove-element/
 * Accepted : Yes
 */
public class InPlaceElementRemoval {
  public int removeElement(int[] A, int elem) {
    int newLen = 0;
    for(int i=0; i< A.length; i++){
      if(A[i] == elem) {
        continue;
      }
      A[newLen] = A[i];
      newLen++;
    }
    return newLen--;
  }
}
