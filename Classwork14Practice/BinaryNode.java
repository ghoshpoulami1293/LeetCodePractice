package Classwork14Practice;

public class BinaryNode {
    private int value;
    private BinaryNode left;
    private BinaryNode right;
    

    public BinaryNode(int value) {
        this.value = value;    
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public BinaryNode getLeft() {
        return left;
    }
    public void setLeft(BinaryNode left) {
        this.left = left;
    }
    public BinaryNode getRight() {
        return right;
    }
    public void setRight(BinaryNode right) {
        this.right = right;
    }
    @Override
    public String toString() {
        return "BinaryNode [value=" + value + ", left=" + left + ", right=" + right + "]";
    }

    public void infixTraversal(Visitor visitor){
        if(left!=null){
                left.infixTraversal(visitor);  //recursion on the left child,  traversing the left subtree.
        }
        visitor.visit(this);                   //on current node after left tree traversal ended and before right tree traversal begins
        if(right!=null){
                right.infixTraversal(visitor); //recursion on the right child, traversing the right subtree.
        }
    }
    
    public boolean search(int target){
        if(target==value){                                  // if target == value
            return true;
        }
        else if(left!=null && left.search(target)){         // recursively search left tree if not null
            return true;
        }
        return (right!=null && right.search(target));       // recursively search right tree if not null   
    }

    public static void main(String[] args) {
        BinaryNode node1 = new BinaryNode(1);
        BinaryNode node2 = new BinaryNode(2);
        BinaryNode node3 = new BinaryNode(3);
        BinaryNode node4 = new BinaryNode(4);        
        BinaryNode node6 = new BinaryNode(6);
        BinaryNode node7 = new BinaryNode(7);
        BinaryNode node9 = new BinaryNode(9);
          
        node2.setLeft(node3);
        node2.setRight(node7);
    
        node3.setLeft(node9);       
        node3.setRight(node4);
    
        node7.setLeft(node1);        
        node7.setRight(node6);    
        System.out.println(node2);  
        
        StringifyVisitor stringifyVisitor = new StringifyVisitor();
        node2.infixTraversal(stringifyVisitor);
        System.out.println(stringifyVisitor);

        System.out.println(node2.search(3));
        System.out.println(node2.search(7));
        System.out.println(node2.search(9));
        System.out.println(node2.search(4));
        System.out.println(node3.search(9));
        System.out.println(node3.search(4));
    }
}