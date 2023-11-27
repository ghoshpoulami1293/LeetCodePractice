package TreesAndGraphs_Trees;
/*
 * You are given the root node of a binary search tree (BST) and a value to insert into the tree. 
 * Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.
 * Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. 
 * You can return any of them.
 */
public class InsertIntoBSTIteration {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = root;
        if(node==null){           
            return new TreeNode(val);
        }
        while(node!=null){
             // value> node --> enter in right subtree
             if(node.val < val){
                if(node.right==null){
                    node.right = new TreeNode(val);
                    return root;
                }
                else node = node.right;
            }
            // value < node --> enter in left subtree
            else{                          
               if(node.val > val){
                if(node.left==null){
                    node.left = new TreeNode(val);
                    return root;
                }
                else node = node.left;
              }
            }      
        }
        return new TreeNode(val);
     }
}
