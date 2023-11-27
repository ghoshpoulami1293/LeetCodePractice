package TreesAndGraphs_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Example 2: 515. Find Largest Value in Each Tree Row
   Given the root of a binary tree, return an array of the largest value in each row of the tree.
 */
public class BFSLargestValInTreeRow {
    public List<Integer> maxValInRow(TreeNode root){
        if(root== null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();

        queue.add(root);

        while(!queue.isEmpty()){
           int currentLevelNodes = queue.size();
           int currentMaxNode = Integer.MIN_VALUE;

           for(int i =0; i<currentLevelNodes;i++){
                TreeNode node = queue.remove();
                currentMaxNode = Math.max(currentMaxNode, node.val);

                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
           } 
           answer.add(currentMaxNode);           
        }
        return answer;
    }   
}
