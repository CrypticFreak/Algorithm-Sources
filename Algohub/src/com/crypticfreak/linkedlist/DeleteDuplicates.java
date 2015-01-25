package javacodes.linkedlist;

/**
 * Created by annkur on 5/18/14.
 */
public class DeleteDuplicates {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode current = head;
    if(current == null) return current;
    ListNode testNode;
    while(current.next != null) {
      if(current.next.val == current.val) current.next = current.next.next;
      else current = current.next;
    }
    return head;
  }
}

