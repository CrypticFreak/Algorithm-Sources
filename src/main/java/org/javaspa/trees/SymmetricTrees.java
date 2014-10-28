package org.javaspa.trees;

/**
 * Created by Ankur K on 5/13/14.
 * http://oj.leetcode.com/problems/symmetric-tree/
 * Accepted : Yes
 */
public class SymmetricTrees {
  public boolean isSymmetric(TreeNode root) {
    if(root == null) return true;
    return areMirrorImage(root.left, root.right);
  }

  private boolean areMirrorImage(TreeNode left, TreeNode right) {
    if(left == null && right == null) return true;
    if(left == null || right == null) return false;
    if(left.val != right.val)
      return false;
    return areMirrorImage(left.left, right.right) && areMirrorImage(left.right, right.left);
  }
}
