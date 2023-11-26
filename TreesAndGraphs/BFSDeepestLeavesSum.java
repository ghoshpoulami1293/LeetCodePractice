package TreesAndGraphs;

import java.util.ArrayDeque;

public class BFSDeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {        
        if(root ==null){
            return 0;
        }       
        
        ArrayDeque<TreeNode> nextLevel = new ArrayDeque<>();    
        ArrayDeque<TreeNode> currentLevel = new ArrayDeque<>();  
        
        //Add root into queue.
        nextLevel.add(root);
        
        
        while(!nextLevel.isEmpty()){
            // prepare for the next level
            currentLevel = nextLevel.clone();  // copy values from next level to current level
            nextLevel.clear();

           for(TreeNode node: currentLevel){
               // for each node in the current level, add left and rigth subtree
                if(node.left!=null){
                    nextLevel.offer(node.left);
                }
                if(node.right!=null){
                    nextLevel.offer(node.right);
                } 
            }
        }  
        int deepestSum =0;
        for (TreeNode node: currentLevel){ // current level now has the last level
            deepestSum += node.val; // add values from the current level
        }
        return deepestSum;
    }
}
