package org.javaspa.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by Ankur K on 5/18/14.
 * http://oj.leetcode.com/problems/populating-next-right-pointers-in-each-node/
 * Accepted: yes
 */
public class RightPointer {
  private class TreeLevel{
    TreeLinkNode node;
    int level;
    TreeLevel(TreeLinkNode node, int level){
      this.level = level;
      this.node = node;
    }
  }
  public void connect(TreeLinkNode root) {

    if(root == null)return;

    Queue<TreeLevel> q = new LinkedList<TreeLevel>();
    q.add(new TreeLevel(root, 0));

    while(!q.isEmpty()){
      TreeLevel front = q.poll();
      if(front.node.left != null){
        q.add(new TreeLevel(front.node.left, front.level + 1));
      }
      if(front.node.right != null){
        q.add(new TreeLevel(front.node.right, front.level + 1));
      }
      TreeLevel nextInQueue = q.peek();
      if(nextInQueue == null || front.level != nextInQueue.level)
      {
        front.node.next = null;
      }
      else{
        front.node.next = nextInQueue.node;
      }
    }
  }
}
