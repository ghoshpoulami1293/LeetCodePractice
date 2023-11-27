package TreesAndGraphs_Trees;
/*
 * Given the root node of a binary search tree and two integers low and high, 
 * return the sum of values of all nodes with a value in the inclusive range [low, high].
 */
public class BSTRangeSum {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }
        int answer =0;
        if(root.val>=low &&  root.val<=high){
            answer+= root.val;
        }
        if(root.val>low){ // if current node is greater than low
            answer+= rangeSumBST(root.left, low, high);
        }
         if(root.val<high){ // if current node is lesser than high
            answer+= rangeSumBST(root.right, low, high);
        }
        return answer;
    }
}
