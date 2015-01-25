package javacodes.trees;

/**
 * Created by Ankur K on 5/9/14.
 * Question : Given an array where elements are sorted in ascending order, convert it to a height balanced BST
 * Online Judge : http://oj.leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * Accepted : Yes
 */

public class ArrayToBST {
  public TreeNode sortedArrayToBST(int[] num) {
    return createBST(num, 0, num.length -1);
  }

  private TreeNode createBST(int[] num, int start, int end){
    if(start > end) return null;
    if(start == end) {
      return new TreeNode(num[start]);
    }
    int mid = (start + end)/2;
    TreeNode node = new TreeNode(num[mid]);
    node.left = createBST(num, start, mid-1);
    node.right = createBST(num, mid + 1, end);
    return node;
  }
}
