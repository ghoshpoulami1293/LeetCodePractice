package TreesAndGraphs_Trees;
import java.util.Stack;

public class GoodNodeStack {

/*
 * Given the root of a binary tree, find the number of nodes that are good.
 * A node is good if the path between the root and the node has no nodes with a greater value.
 */
    public class Pair{
        TreeNode node;
        int maxSoFar;

        public Pair(TreeNode node, int maxSoFar) {
            this.node = node;
            this.maxSoFar = maxSoFar;
        }        
    }

    public class Solution{
        public int goodNodes(TreeNode node){
            if(node ==null){
                    return 0;
                }                

            Stack<Pair> stack = new Stack<>();
            stack.push(new Pair(node, Integer.MIN_VALUE));
            int answer =0;


            while(!stack.isEmpty()){
                Pair pair = stack.pop();
                TreeNode treenode = pair.node;
                int maxSoFar= pair.maxSoFar;

                if(treenode.val>maxSoFar){
                    answer+=1;
                }
                if(treenode.left!=null){
                    stack.push(new Pair(treenode.left, Math.max(maxSoFar, treenode.val)));
                }
                if(treenode.right!=null){
                    stack.push(new Pair(treenode.right, Math.max(maxSoFar, treenode.val)));
                }           
            }
            return answer;
        }
    }
}
