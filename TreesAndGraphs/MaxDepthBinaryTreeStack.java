package TreesAndGraphs;

import java.util.Stack;

/*
 * Example 1: 104. Maximum Depth of Binary Tree
   Given the root of a binary tree, find the length of the longest path from the root to a leaf.
 */
public class MaxDepthBinaryTreeStack {
  class Pair{
    TreeNode node;
    int depth;

    public Pair(TreeNode node, int depth) {
        this.node = node;
        this.depth = depth;
    }    
  }
  class Solution{
    public int maxDepth(TreeNode root) {

        if(root==null){
          return 0;
        }

        Stack<Pair> stack = new Stack();
        stack.push(new Pair(root,1)); // starting point 
        int answer =0;  // calculate the max between left and right subtrees

        while(!stack.isEmpty()){
          Pair pair = stack.pop(); // utilize each pair value to determine node, depth , and left and right node from that node
          TreeNode node = pair.node; //get the node from the pair 
          int depth = pair.depth; // get depth value from pair

          answer = Math.max(answer, depth); // get the max value 

          if(node.left!=null){
            stack.push(new Pair(node.left, depth+1)); // traverse right subtree
          }

          if(node.right!=null){
            stack.push(new Pair(node.right, depth+1)); // traverse right subtree 
          }
        }
        return answer;
      }
    }
  }