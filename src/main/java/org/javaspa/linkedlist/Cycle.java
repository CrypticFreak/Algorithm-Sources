package org.javaspa.linkedlist;

/**
 * Created by Ankur K on 5/18/14.
 * http://oj.leetcode.com/problems/linked-list-cycle/
 */
public class Cycle {
  public boolean hasCycle(ListNode head) {

    if (head == null) return false;
    ListNode slow = head, fast = head, mid;

    do {
      slow = slow.next;
      fast = fast.next;
      if (slow == null || fast == null) return false;
      fast = fast.next;
      if (fast == null) return false;
    } while (slow != fast);
    return true;
  }
}