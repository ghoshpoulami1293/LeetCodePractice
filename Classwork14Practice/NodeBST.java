package Classwork14Practice;

public class NodeBST implements BinarySearchTree {
    BinaryNode root;
    int size;

    public NodeBST() {
        this.root = null; // root points to null initially
        this.size = 0; 
    }

    @Override
    public void insert(int value) {
        if(root == null){                   // if no node is present in tree, root = new value
            root= new BinaryNode(value);
        }
        else binaryInsert(root,value);      // else add the value based on comparison with the existing node value
        }

    private void binaryInsert(BinaryNode node, int value) {
        if(value<node.getValue()){                  // if value less than the root node
            BinaryNode left = node.getLeft();       // check left subtree
            if(left!=null){                         // value present in left subtree
                binaryInsert(left, value);          // recursion
            }else{
                    node.setLeft(new BinaryNode(value));// set the left node
            }
        }

        if(value>node.getValue()){                  // if value less than the root node
            BinaryNode right = node.getRight();     // check right subtree
            if(right!=null){                        // value present in right subtree
                binaryInsert(right, value);         // recursion
            }else{
                    node.setRight(new BinaryNode(value));// set the left node
            }
        }
    }

    @Override
    public boolean search(int target) {             //Helper function
     return binarySearch(root, target);             // pass root and value to search
    }

    private boolean binarySearch(BinaryNode node, int target) {
        if(node == null){                                // if tree is empty, return false
            return false;
        }
        else if(target== node.getValue())                // 1st iteration-check:root node= target, other iterations-check:node value = target
        return true;

        else if(target<node.getValue()){
            return binarySearch(node.getLeft(), target); // if the target value is lesser than root node, check in left subtree
        }
        else if(target>node.getValue()){
            return binarySearch(node.getRight(), target);// if the target value is lesser than root node, check in right subtree
        }
        return false;
    }

    @Override
    public void infixTraversal(Visitor visitor) {
           if(root!=null){
            root.infixTraversal(visitor);
           } 
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new NodeBST();
        bst.insert(5);
        bst.insert(7);
        bst.insert(6);
        bst.insert(2);
        bst.insert(3);
        bst.insert(9);
        bst.insert(1);


        System.out.println(bst.search(1));
        System.out.println(bst.search(3));
        System.out.println(bst.search(9));
        System.out.println(bst.search(4)); //false

        StringifyVisitor stringifyVisitor = new StringifyVisitor();
        bst.infixTraversal(stringifyVisitor);
        System.out.println(stringifyVisitor); //1 2 3 5 6 7 9
    }
    
}
