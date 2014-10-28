package org.javaspa.trees;

/**
 * Created by annkur on 5/21/14.
 */
public class MinDepth {
  public int minDepth(TreeNode root) {
    if(root == null) return 0;
    if(root.left == null && root.right == null) return 1;
    if(root.left == null) return minDepth(root.right) + 1;
    if(root.right == null) return minDepth(root.left) + 1;
    return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
  }
}