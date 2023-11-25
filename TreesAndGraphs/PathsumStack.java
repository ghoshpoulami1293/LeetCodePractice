package TreesAndGraphs;

import java.util.Stack;

public class PathsumStack {
    public class Pair{
        TreeNode node;
        int current;
        public Pair(TreeNode node, int current) {
            this.node = node;
            this.current = current;
        }        
    }
    public class Solution{
         public boolean hasPathSum(TreeNode root, int targetSum){
           
            if(root== null){    // if tree has no node
                return false;   // returns to the recursion call
             }

            Stack<Pair> stack = new Stack();
            stack.push(new Pair(root, 0));

            while(!stack.isEmpty()){
                Pair pair = stack.pop();
                TreeNode node = pair.node;
                int curr = pair.current;

                if(root.left == null && root.right==null) {        // leaf node reached 
                    return (curr +node.val == targetSum);           // returns to the recursion call
                }

                // for all values unless the leaf node is reached
                curr+= node.val;
                if(node.left!=null){
                    stack.push(new Pair(node.left, curr));  // traverse left subtree
                }
                 if(node.right!=null){
                    stack.push(new Pair(node.right, curr)); // traverse right subtree
                }
            }
            
          return false;
         }
     }    
}
