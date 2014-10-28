package org.javaspa.trees;

import java.util.ArrayList;

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

public class RecursivePostOrderTraversal {
  public ArrayList<Integer> postOrderTraversal(TreeNode root) {
    ArrayList<Integer> resultList = new ArrayList<Integer>();
    traversePostorderRecursive(root, resultList);
    return resultList;
  }

  private void traversePostorderRecursive(TreeNode root, ArrayList<Integer> list){
    if(root == null) return ;
    traversePostorderRecursive(root.left, list);
    traversePostorderRecursive(root.right, list);
    list.add(root.val);
  }
}
