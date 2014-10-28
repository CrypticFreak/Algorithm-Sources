package org.javaspa.linkedlist;

/**
 * Created by annkur on 7/28/14.
 */
public class SortLinkedList {
  public ListNode sortList(ListNode head) {
    ListNode pre,post,precurr,postcurr;
    ListNode temp;
    temp = head;
    int pivot = temp.val;
    temp = temp.next;

    while(temp!= null){
      if(temp.val<pivot){
        if(pre == null){
          pre = temp;
          precurr = temp;
        } else{

        }

      }
    }
  }
}