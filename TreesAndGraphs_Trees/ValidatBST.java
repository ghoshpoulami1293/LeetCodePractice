package TreesAndGraphs_Trees;
/*
 * Example 3: 98. Validate Binary Search Tree
   Given the root of a binary tree, determine if it is a valid BST.
 */
/*
 * An empty tree (no nodes) is technically a BST. Therefore, we can return true when the current node is null.
 * At each node, the left subtree nodes should be less than node.val, so we can update large = node.val.
 * The right subtree nodes should be greater than node.val, so we can update small = node.val. 
 * For the root node, we can initialize small = -infinity and large = infinity - the root can be any value since it has no parent.
 * We can use two integer arguments small and large, and make sure small < node.val < large holds.
 */
public class ValidatBST {
    public boolean isValidBST(TreeNode root) {
       return dfs(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    private boolean dfs(TreeNode root, int maxValue, int minValue) {
        if(root == null){
            return true;
        }
        if(root.val >= maxValue || root.val<= minValue){ //child node limitations 
            return false;
        }

        boolean left = dfs(root.left, root.val, minValue);
        boolean right = dfs(root.right, maxValue, root.val);
        
        return (left && right);
    }
}
