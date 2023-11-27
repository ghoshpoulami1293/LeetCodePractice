package TreesAndGraphs_Trees;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class MaxDiffNodeAncestor {
    public int maxAncestorDiff(TreeNode root) {
        //empty tree
        if(root==null){
            return 0;
        }
        //non empty tree
        return helper(root, root.val, root.val);
        }

        public int helper(TreeNode node, int currentMax, int currentMin){
            
            // return the difference of max value and min value of a subtree when we reach a leaf node
            if(node ==null){
                return currentMax- currentMin;
            }

            // if leaf node is not encountered, calculate new currentMax and currentMin of the subtree
            currentMax = Math.max(currentMax,node.val);
            currentMin = Math.min(currentMin,node.val);

            //recursion to traverse each subtree
            int leftsubtree = helper(node.left,currentMax,currentMin);
            int rightsubtree = helper(node.right,currentMax,currentMin);

            return Math.max(leftsubtree, rightsubtree);
        }
}
