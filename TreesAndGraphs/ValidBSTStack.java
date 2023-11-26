package TreesAndGraphs;
import java.util.Stack;
/*
 * Example 3: 98. Validate Binary Search Tree
   Given the root of a binary tree, determine if it is a valid BST.
 */
/*
 * An empty tree (no nodes) is technically a BST. Therefore, we can return true when the current node is null.
 * At each node, the left subtree nodes should be less than node.val, so we can update large = node.val.
 * The right subtree nodes should be greater than node.val, so we can update small = node.val. 
 * For the root node, we can initialize small = -infinity and large = infinity - the root can be any value since it has no parent.
 * We can use two integer arguments small and large, and make sure small < node.val < large holds.
 */
public class ValidBSTStack {
    public class State{
        TreeNode node ;
        long small;
        long large;
        public State(TreeNode node, long small, long large) {
            this.node = node;
            this.small = small;
            this.large = large;
        }        
    }
    public class Solution {
        public boolean isValidBST(TreeNode root) {
            Stack<State> stack = new Stack();
            stack.push(new State(root, Long.MIN_VALUE, Long.MAX_VALUE));

            while(!stack.isEmpty()){
                State state = stack.pop();
                TreeNode node = state.node;
                long small = state.small;
                long large = state.large;

                if(small>= node.val && node.val>=large){
                    return false;
                }
                if(node.left!=null){
                    stack.push(new State(root, Long.MIN_VALUE, node.val));
                }
                if(node.left!=null){
                    stack.push(new State(root, node.val, Long.MAX_VALUE));
                }
            }
            return true;
        }
    }
}
