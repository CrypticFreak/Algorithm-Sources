package org.javaspa.trees;

import java.util.ArrayList;
import java.util.Stack;
/**
 * Created by Ankur K on 5/9/14.
 * Question : Given a binary tree, return the post order traversal of its nodes' values.
 * For example:
 * Given binary tree {1,#,2,3},
 * 1
 *  \
 *  2
 *  /
 * 3
 * return [1, 2, 3].
 * Online Judge : http://oj.leetcode.com/problems/binary-tree-postorder-traversal/
 * Accepted : Yes
 *
 * Recursive solution
 */

public class IterativePostOrderTraversal {
  private class StackTuple{
    final TreeNode node;
    Boolean isPoppedearlier;

    StackTuple(TreeNode node, Boolean isPoppedEarlier){
      this.node = node;
      this.isPoppedearlier = isPoppedEarlier;
    }
  }
  public ArrayList<Integer> inorderTraversal(TreeNode root) {
    ArrayList<Integer> resultList = new ArrayList<Integer>();
    if(root == null) return resultList;

    Stack<StackTuple> treeStack = new Stack<StackTuple>();
    StackTuple current;
    treeStack.push(new StackTuple(root, false));

    while(!treeStack.empty()){
      current = treeStack.pop();
      if(current.isPoppedearlier){
        resultList.add(current.node.val);
      }
      else{
        current.isPoppedearlier = true;
        treeStack.push(current);
        if(current.node.right != null) treeStack.push(new StackTuple(current.node.right, false));
        if(current.node.left != null) treeStack.push(new StackTuple(current.node.left, false));
      }
    }
    return resultList;
  }
}
