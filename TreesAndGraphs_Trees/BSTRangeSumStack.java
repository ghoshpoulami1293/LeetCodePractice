package TreesAndGraphs_Trees;
import java.util.Stack;
/*
 * Given the root node of a binary search tree and two integers low and high, 
 * return the sum of values of all nodes with a value in the inclusive range [low, high].
 */
public class BSTRangeSumStack {
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if(root==null){
            return 0;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        int answer=0;

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.val>=low && node.val<=high){
                answer+= node.val;
            }

            if(node.val>low && node.left!=null){
                stack.push(node.left);
            }

            if(node.val<high && node.right!=null){
                stack.push(node.right);
            }        
        }
        return answer;
    }
}
