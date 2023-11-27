package TreesAndGraphs_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTreeTraversal {
    public void printAllNodes(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            //store the number of nodes in the current level nodesInCurrentLevel before iterating
            // to make sure the for loop doesn't iterate over any other nodes.
            int nodesInCurrentLevel= queue.size();

            //do some logic for the current level
            for(int i=0;i<nodesInCurrentLevel;i++){
                TreeNode node = queue.remove();         // remove each element in that level 

                // do some logic on the current node
                System.out.println(node.val);

                //put the next level on to the queue
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }         
         }        
    }
}
