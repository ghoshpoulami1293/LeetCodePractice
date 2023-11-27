package TreesAndGraphs_Trees;

public class GoodNode {

    /*
    * Given the root of a binary tree, find the number of nodes that are good.
    * A node is good if the path between the root and the node has no nodes with a greater value.
    */
    public int goodNodes(TreeNode root){
        return countGoodNodes(root, Integer.MIN_VALUE) ;  // set it to -ve infinity        
    } 
    public int countGoodNodes(TreeNode node, int maxSoFar){
        if(node== null){
            return 0;
        }

        int left = countGoodNodes(node.left, Math.max(maxSoFar,node.val)); // calculate number of good nodes in left subtree
        int right = countGoodNodes(node.right, Math.max(maxSoFar,node.val)); // calculate number of good nodes in right subtree
        int answer = left + right;

        // Total good nodes in a subtree is the number of :
        // good nodes in the left subtree + the number of good nodes in the right subtree + 1 if the current node is a good node.
        if(node.val>=maxSoFar){ // current node is a good node
            answer+=1;
        }

        return answer;
    }
}
