package TreesAndGraphs_Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
 * Given the root of a binary tree, 
 * imagine yourself standing on the right side of it. Return the values of the nodes you can see ordered from top to bottom.
*/
import java.util.Queue;


/* Solution:
 * Essentially, this question is asking for the rightmost node at each level. 
 * If we do BFS with the same code format as above, we have a moment at each while loop iteration where we have an entire level in an array.
 * If we prioritize the left children before the right children, then the final value at each iteration will be the rightmost node.
*/
public class BFSRightSideOfTreeView {
    public List<Integer> rightSideView(TreeNode root){
        if(root==null){
            return null;
        }
        List<Integer> answer = new ArrayList();             // to store list of right nodes
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            int currentNodes = queue.size();
            int prevNode = 0;           
            
        for(int i =0; i<currentNodes ; i++)
        {
            TreeNode node= queue.remove();
            prevNode = node.val;
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
       answer.add(prevNode);
     }
    return answer;
  }    
}
