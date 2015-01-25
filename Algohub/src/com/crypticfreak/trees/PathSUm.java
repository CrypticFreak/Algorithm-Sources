package javacodes.trees;

/**
 * Created by annkur on 5/18/14.
 */
public class PathSUm {
  public boolean hasPathSum(TreeNode root, int sum) {
  if(root == null)return false;
  return hasPathSumInternal(root, sum);
}
  private boolean hasPathSumInternal(TreeNode root, int sum) {
    if(root == null && sum == 0)return true;
    if(root == null) return false;
    if(root.left == null) return hasPathSumInternal(root.right, sum-root.val);
    if(root.right == null) return hasPathSumInternal(root.left, sum-root.val);
    return hasPathSumInternal(root.left, sum - root.val) || hasPathSumInternal(root.right, sum - root.val);
  }
}

