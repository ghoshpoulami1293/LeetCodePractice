package TreesAndGraphs;
/*
 * Example 1: 104. Maximum Depth of Binary Tree
   Given the root of a binary tree, find the length of the longest path from the root to a leaf.
 */
public class MaxDepthBinaryTree {
  public int maxDepth(TreeNode root) {

    if(root==null){
      return 0;
    }
    int leftSubtreeLength= maxDepth(root.left);
    int rightSubtreeLength = maxDepth(root.right);

    int finalLength= Math.max(rightSubtreeLength,leftSubtreeLength) +1;
    
    return finalLength;
    
  }
}
