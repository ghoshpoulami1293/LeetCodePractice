package TreesAndGraphs_Trees;
/*
 * You are given the root node of a binary search tree (BST) and a value to insert into the tree.
 * Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.
 * Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion.
 * You can return any of them.
 */
public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        //insert into left subtree
        if(val<root.val){           
            root.left = insertIntoBST(root.left,val);  
        }
        //insert into right subtree
        if(val>root.val){           
            root.right = insertIntoBST(root.right,val);          
        }

        return root;
    }
}
