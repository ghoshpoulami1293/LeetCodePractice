package TreesAndGraphs_Trees;

import java.util.ArrayList;
import java.util.List;

/*
 * Given the root of a BST, return the minimum absolute difference between the values of any two different nodes in the tree.
 */
public class BSTMinAbsoluteDiff {
    public int getMinimumDifference(TreeNode root) {        
        List<Integer> values = new ArrayList<>();
        dfs(root, values);
        int answer= Integer.MAX_VALUE;
        for(int i=0;i<values.size()-1;i++){
            answer= Math.min(answer, Math.abs(values.get(i)-values.get(i-1)));
        }
        return answer;
    }

    private void dfs(TreeNode root,List<Integer> values) {
        if(root==null){
            return;
        }
       dfs(root.left, values); 
       values.add(root.val);
       dfs(root.right, values);
    }
}   
