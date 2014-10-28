package org.javaspa.trees;

import java.util.ArrayList;

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
public class RecursivePreOrderTraversal {
  public ArrayList<Integer> preOrderTraversal(TreeNode root) {
    ArrayList<Integer> resultList = new ArrayList<Integer>();
    traversePreorderRecursive(root, resultList);
    return resultList;
  }

  private void traversePreorderRecursive(TreeNode root, ArrayList<Integer> list){
    if(root == null) return ;
    list.add(root.val);
    traversePreorderRecursive(root.left, list);
    traversePreorderRecursive(root.right, list);
  }
}