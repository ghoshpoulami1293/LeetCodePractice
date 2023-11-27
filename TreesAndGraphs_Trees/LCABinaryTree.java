package TreesAndGraphs_Trees;
/*
 * Bonus example: 236. Lowest Common Ancestor of a Binary Tree
   Given the root of a binary tree and two nodes p and q that are in the tree, return the lowest common ancestor (LCA) of the two nodes.
   The LCA is the lowest node in the tree that has both p and q as descendants (note: a node is a descendant of itself).
 */
public class LCABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode node1, TreeNode node2){
        if(root ==null){
            return null;
        }
        // Case1 : The root node is p or q.
        // The answer cannot be below the root node, because then it would be missing the root (which is either p or q) as a descendant.
        if(root ==node1 || root==node2){
            return root;
        }

        TreeNode leftTreeNode = lowestCommonAncestor(root.left,node1, node2);
        TreeNode rightTreeNode = lowestCommonAncestor(root.right,node1, node2);

        // Second case: One of p or q is in the left subtree, and the other one is in the right subtree. 
        // The root must be the answer, because it is the connection point between the two subtrees, 
        // and thus the lowest node to have both p and q as descendants.

        if(leftTreeNode!=null && rightTreeNode!=null){
            return root;
        }

        // third case : Both p and q are in one of the subtrees.
        // In that case, the root is not the answer because we could look inside the subtree and find a "lower" node.
        if(leftTreeNode !=null){
            return leftTreeNode;
        }
        return rightTreeNode;

    }
}
