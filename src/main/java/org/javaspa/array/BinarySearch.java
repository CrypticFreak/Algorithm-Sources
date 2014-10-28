package org.javaspa.array;

/**
 * Created by Ankur K on 5/13/14.
 * Question : http://oj.leetcode.com/problems/search-insert-position/
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 * Accepted : No
 *
 * This example is a simple example of our very own classic binary search
 */
public class BinarySearch {
  public int searchInsert(int[] A, int target) {
    int start = 0, end = A.length;
    while(start < end){
      int mid = (start + end)/2;
      if(A[mid] == target) return mid;

      if(A[mid] < target && A[mid + 1] > target) return mid+1;

      if(A[mid] > target) {
        end = mid - 1;
      }
      else {
        end = mid + 1;
      }
    }
    return Math.min(start + 1, A.length);
  }
}
