package org.javaspa.trees;

/**
 * Created by annkur on 7/28/14.
 */

public class LeftViewTree {

  public void leftView(TreeNode root){
    _leftView(root, -1, 0);
  }
  private int _leftView(TreeNode root, int maxLevel, int currentLevel){
    if(root == null) return maxLevel;
    if(maxLevel < currentLevel){
      System.out.println(root.val);
      maxLevel = currentLevel;
    }

    maxLevel = _leftView(root.left, maxLevel, currentLevel + 1);
    maxLevel = _leftView(root.right, maxLevel, currentLevel + 1);
    return maxLevel;
  }
}
