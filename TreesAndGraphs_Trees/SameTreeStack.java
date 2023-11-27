package TreesAndGraphs_Trees;
    /*
     * Given the roots of two binary trees p and q, check if they are the same tree. 
     * Two binary trees are the same tree if they are structurally identical and the nodes have the same values.
     */

import java.util.Stack;

/*
      * This problem really demonstrates the recursive nature of binary trees.
        If p and q are the same tree, then the following is true:
            p.val = q.val
            p.left and q.left are the same tree
            p.right and q.right are the same tree
      */
public class SameTreeStack {
    public class Pair{
        TreeNode node1;
        TreeNode node2;
        public Pair(TreeNode node1, TreeNode node2) {
            this.node1 = node1;
            this.node2 = node2;
        }    
    }
    public class Solution{
        
        public boolean isSameTree(TreeNode node1, TreeNode node2){
        
        Stack<Pair> stack = new Stack();
        stack.push(new Pair(node1, node2));
        

        while(!stack.isEmpty()){
            Pair pair = stack.pop();
            TreeNode treeNode1 = pair.node1;
            TreeNode treeNode2 = pair.node2;
        
            if(treeNode1==null && treeNode2==null){ // both are empty trees
                return true;
            }
            
            if(treeNode1==null || treeNode2==null){ // one of them is an empty trees
                return false;
            }

            if(treeNode1.val!= treeNode2.val){ // one of them is an empty trees
                return false;
            }

            stack.push(new Pair(treeNode1.left, treeNode2.left));
            stack.push(new Pair(treeNode1.right, treeNode2.right));
        }

        return true; // if both are true, return true
      }
    }
   }