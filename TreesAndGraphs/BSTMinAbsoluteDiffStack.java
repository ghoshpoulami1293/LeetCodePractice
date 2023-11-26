package TreesAndGraphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BSTMinAbsoluteDiffStack {
    public int getMinimumDifference(TreeNode root){  
        List<Integer> values = new ArrayList<>();
        dfs(root, values);

        int answer= Integer.MAX_VALUE;

        for(int i=1; i<values.size();i++){
            answer= Math.min(answer, Math.abs(values.get(i)- values.get(i-1)));
        }
        return answer;
    }

    private void dfs(TreeNode root, List<Integer> values){
        Stack<TreeNode> stack= new Stack<>();
        TreeNode currentNode = root;
        stack.push(root);

        while(!stack.isEmpty() || currentNode!=null){
            if(currentNode!=null)   //root, leftnode , null
            {
                stack.push(currentNode); //root, leftnode
                currentNode = currentNode.left; //root.left , null
            }
            else
            {
                currentNode = stack.pop(); // leftnode
                values.add(currentNode.val); //leftnode.val
                currentNode = currentNode.right;  // right node of leftnode
            }           
        }
    }
}
