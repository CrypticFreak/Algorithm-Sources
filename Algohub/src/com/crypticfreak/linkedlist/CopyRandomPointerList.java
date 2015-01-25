package javacodes.linkedlist;

/**
 * Created by annkur on 5/18/14.
 */
public class CopyRandomPointerList {

  public RandomListNode copyRandomList(RandomListNode head) {
    //Make a copy of nodes just after the initial node
    if(head == null) return null;
    RandomListNode current = head;
    RandomListNode result;
    while(current != null){
      RandomListNode tempNode = new RandomListNode(current.label);
      tempNode.next = current.next;
      current.next = tempNode;
      current = current.next.next;
    }
    current = head;
    result = head.next;
    RandomListNode resultHead = head.next;
    while(current != null){

      if(current.random != null)
        result.random = current.random.next;
      else result.random = null;

      current.next = current.next.next;
      current = current.next;

      if(current == null)
      {
        result.next = null;
      }
      else {
        result.next = current.next;
        result = result.next;
      }
    }
    return resultHead;
  }
}