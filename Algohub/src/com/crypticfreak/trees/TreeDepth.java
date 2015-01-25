package javacodes.trees;

/**
 * Created by Ankur K on 5/7/14.
 */
public class TreeDepth {
  public int maxDepth(TreeNode root) {
    if(root == null) {
      return 0;
    }
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
  }
}
