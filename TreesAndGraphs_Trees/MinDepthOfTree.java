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
public class MinDepthOfTree {
    public int minDepth(TreeNode root) {
        // null root
        if(root==null){
            return 0;
        }           

        //one child is null, other subtree to be calculated
        if(root.left==null){
            return 1 + minDepth(root.right);
        }  
        else if(root.right ==null){
            return 1 + minDepth(root.left);
        }

        //both children are not null
        int leftSubtree = minDepth(root.left);
        int rightSubtree =minDepth(root.right);
        int shortestPath = Math.min(leftSubtree,rightSubtree);
        return shortestPath+1;
    }
}

