/*
Example 2: 863. All Nodes Distance K in Binary Tree

Given the root of a binary tree, a target node target in the tree, and an integer k, 
return an array of the values of all nodes that have a distance k from the target node.
*/
package TreesAndGraphs_Graphs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BFSAllNodesDistanceK {

    Map<TreeNode, TreeNode> parents = new HashMap<>();


    public List<Integer> distanceK(TreeNode root, TreeNode target , int k){
        
        dfs(root,null);

        Queue<TreeNode>queue = new LinkedList<>();
        Set<TreeNode> seen = new HashSet<>();

        //starting point
        queue.add(target);
        seen.add(target);

        int distance =0;

        while(!queue.isEmpty() && distance <k){

            //each level
            int currentLength = queue.size();
            for(int i = 0; i<currentLength;i++){
                TreeNode node = queue.remove();
                TreeNode left = node.left;
                TreeNode right = node.right;
                TreeNode parent = parents.get(node);
                TreeNode[]nodeDetails =new TreeNode[]{left,right,parent};

                //add children
                for(TreeNode neighbour : nodeDetails){
                    if(neighbour!=null && !seen.contains(neighbour)){
                        seen.add(neighbour);
                        queue.add(neighbour);
                    }
                }
            }
            distance++;
        }

        //last level at distance k is the answer
        List<Integer> answer = new ArrayList<>();
        for(TreeNode node: queue){
            answer.add(node.val);
        }
        return answer;
        
    }

    //creates the map of the node and its parent for backtracking
    private void dfs(TreeNode node, TreeNode parent) {
        if(node == null){
            return;
        }

        parents.put(node,parent);
        dfs(node.left,parent);
        dfs(node.right,parent);
        
    }

}
