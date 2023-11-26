package TreesAndGraphs;
    /*
     * Given the roots of two binary trees p and q, check if they are the same tree. 
     * Two binary trees are the same tree if they are structurally identical and the nodes have the same values.
     */

     /*
      * This problem really demonstrates the recursive nature of binary trees.
        If p and q are the same tree, then the following is true:
            p.val = q.val
            p.left and q.left are the same tree
            p.right and q.right are the same tree
      */
public class SameTree {
   public boolean isSameTree(TreeNode node1, TreeNode node2){

    if(node1==null && node2==null){ // both are empty trees
        return true;
    }
    
    if(node1==null || node2==null){ // one of them is an empty trees
        return false;
    }

    if(node1.val!= node2.val){ // one of them is an empty trees
        return false;
    }

    boolean leftSubtree = isSameTree(node1.left, node2.left);
    boolean rightSubtree = isSameTree(node1.right, node2.right);

    return (leftSubtree && rightSubtree); // if both are true, return true
   }
}
