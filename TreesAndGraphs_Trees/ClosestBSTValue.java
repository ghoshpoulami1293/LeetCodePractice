package TreesAndGraphs_Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Given the root of a binary search tree and a target value, return the value in the BST that is closest to the target.
 *  If there are multiple answers, print the smallest.
 */
public class ClosestBSTValue {
    /* failed for single input root - remaining worked :
    /public int closestValue(TreeNode root, double target) {
        if(root==null){
            return 0;
        }
        int left=0;
        int right=0;
        if(target<root.val){
            left = closestValue(root.left,target);
        }
        else if(target> root.val){
            right = closestValue(root.right,target);
        } 
        return (int) Math.round((Math.min(Math.abs(target- left),Math.abs(target- right))));
    }
    */
    /**Correct Solution */
    // DFS inorder traversal
        public void inorder(TreeNode root, List<Integer> nums) {
            if (root == null) 
                return;
            
            inorder(root.left, nums);   // recursion for left subtree
            nums.add(root.val);         // add the current node to nums
            inorder(root.right, nums);  // recursion for right subtree
        }

        public int closestValue(TreeNode root, double target) {
            List<Integer> nums = new ArrayList(); // store the elements in arraylist
            inorder(root, nums);

            return Collections.min(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1 - target) < Math.abs(o2 - target) ? -1 : 1;
            }
            });            
        }
    }

