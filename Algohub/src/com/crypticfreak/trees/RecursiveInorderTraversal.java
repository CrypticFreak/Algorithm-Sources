package javacodes.trees;

import java.util.ArrayList;

/**
 * Created by Ankur K on 5/9/14.
 * Question : Given a binary tree, return the inorder traversal of its nodes' values.
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * For example:
 * Given binary tree {1,#,2,3},
 * 1
 *  \
 *  2
 *  /
 * 3
 * return [1, 2, 3].
 * Online Judge : http://oj.leetcode.com/problems/binary-tree-inorder-traversal/
 * Accepted : Yes
 *
 * Recursive solution
 */
public class RecursiveInorderTraversal {

  public ArrayList<Integer> inOrderTraversal(TreeNode root) {
    ArrayList<Integer> resultList = new ArrayList<Integer>();
    traverseInorderRecursive(root, resultList);
    return resultList;
  }

  private void traverseInorderRecursive(TreeNode root, ArrayList<Integer> list){
    if(root == null) return ;
    traverseInorderRecursive(root.left, list);
    list.add(root.val);
    traverseInorderRecursive(root.right, list);
  }
}
