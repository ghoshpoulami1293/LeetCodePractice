package TreesAndGraphs_Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
 * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. 
 * (i.e., from left to right, then right to left for the next level and alternate between).
 */
public class BFSZigZagTreeTraversal {
   public List<List<Integer>> zigzagLevelOrder(TreeNode root){
       
         //base case
        if(root==null){
           return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> answerList = new ArrayList<>();
        Map <Integer,List<Integer>> map = new HashMap<>();        

        ArrayDeque<TreeNode> currentLevel = new ArrayDeque<>(); 
        ArrayDeque<TreeNode> nextLevel = new ArrayDeque<>();    
        nextLevel.add(root);
        int level=1;
        while(!nextLevel.isEmpty()){
            currentLevel = nextLevel.clone();  
            nextLevel.clear();

            List<Integer> currenLevelList = new ArrayList<>();
            
            for(TreeNode node: currentLevel){
                
                // add values from the current level in the list from the currentLevel
                currenLevelList.add(node.val); 

                // for each node in the current level, add left and right subtree
                if(node.left!=null){
                    nextLevel.add(node.left);
                }
                if(node.right!=null){
                    nextLevel.add(node.right);
                }
            }
            map.put(level, currenLevelList);
            level++;
        }  
        for(int lev : map.keySet()){
            if(lev%2==0){
                Collections.reverse(map.get(lev));
            }
           answerList.add(map.get(lev)); 
        }
        return answerList;
    }
}