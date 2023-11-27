package TreesAndGraphs_Trees;

public class Pathsum {
    int target ;

    public boolean hasPathSum(TreeNode root, int targetSum){
            target = targetSum;
            return sum(root,0) ; // current = 0 , it starts will 0 as sum initialized        
    }

    public boolean sum(TreeNode node, int curr){
        if(node== null){    // if tree has no node
            return false;   // returns to the recursion call
        }

        if(node.left == null && node.right==null) { // leaf node reached 
            return (curr +node.val == target);      // returns to the recursion call
        }

        // for all values unless the leaf node is reached
        curr+= node.val;
        boolean left = sum(node.left, curr); // traverse left subtree
        boolean right = sum(node.right, curr); // traverse right subtree
        return (left|| right); // return if left or right has a path with the target sum to hasPathSum method

    }
    
}
