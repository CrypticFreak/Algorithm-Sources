package org.javaspa.trees;

/**
 * Created by AnkurK on 7/17/14.
 */
public class IsBst {
  public boolean isValidBST(TreeNode root) {
  return isValidBSTInternal(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
}

  private boolean isValidBSTInternal(TreeNode root, int max, int min){
    if(root.val < max && root.val > min){
      return isValidBSTInternal(root.left, root.val-1, min) && isValidBSTInternal(root.left, max, root.val + 1);
    }
    else return false;
  }
}