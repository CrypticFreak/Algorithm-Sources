package org.javaspa.trees;

import java.util.ArrayList;
import java.util.Stack;


/**
 * Created by Ankur K on 5/9/14.
 * Question : Given a binary tree, return the pre order traversal of its nodes' values.
 * For example:
 * Given binary tree {1,#,2,3},
 * 1
 *  \
 *  2
 *  /
 * 3
 * return [1, 2, 3].
 * Online Judge : http://oj.leetcode.com/problems/binary-tree-preorder-traversal/
 * Accepted : Yes
 *
 * Recursive solution
 */

public class IterativePreOrderTraversal {
  public ArrayList<Integer> inorderTraversal(TreeNode root) {
    ArrayList<Integer> resultList = new ArrayList<Integer>();
    if(root == null) return resultList;

    Stack<TreeNode> treeStack = new Stack<TreeNode>();
    TreeNode current;
    treeStack.push(root);

    while(!treeStack.empty()){
      current = treeStack.pop();
      resultList.add(current.val);
      if(current.right != null) treeStack.push(current.right);
      if(current.left != null) treeStack.push(current.left);
    }
    return resultList;
  }
}
