package javacodes.trees;

/**
 * Created by Ankur K on 5/9/14.
 * Question : Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more than 1.
 * Online Judge : http://oj.leetcode.com/problems/balanced-binary-tree/
 * Accepted : Yes
 */
public class BalancedTree {
  public boolean isBalanced(TreeNode root) {
  return (checkHeightAndBalance(root) != -1);
  }

  private int checkHeightAndBalance(TreeNode root){
    if(root == null) {
      return 0;
    }
    int heightLeft, heightRight;
    heightLeft = checkHeightAndBalance(root.left);
    heightRight = checkHeightAndBalance(root.right);
    Boolean isNotBalanced = (heightLeft == -1) || (heightRight == -1) || (Math.abs(heightLeft - heightRight) > 1);
    if(isNotBalanced) return -1;
    else return Math.max(heightLeft, heightRight) + 1;
  }
}
