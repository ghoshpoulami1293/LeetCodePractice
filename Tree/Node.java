package Tree;

public class Node {

    //define left and right nodes
    Node left, right;

    //root node data is present in this 
    int data ;

    //Constructor
    Node(int data){
        this.data =data;
    }

    //Insert values in BST :
    public void insert(int value){
        if(value<=data){
            if(left==null){
                left= new Node(value);
            }
            else{
                left.insert(value);
            }
        }
        else if(value>=data){
            if(right == null){
                right = new Node(value);
            }else{
                right.insert(value);
            }
        }            
    }

    public boolean findValue(int value){
        if(value ==data){
            return true;
        }else if(value < data)
        {
            if(left == null){
                return false ; // value not present
            }else{
                return (left.findValue(value));
            }
        }else if(value > data)
        {
            if(right == null){
                return false ; // value not present
            }else{
                return (right.findValue(value));
            }
        }
        return false;        
    }
    // inorder = Left , Root, Right 
    public void printInOrderTraversal(){
        // traverse till the node has no left node left .Then print it
        if(left!=null){
            left.printInOrderTraversal();
        }
        System.out.print(data + " ");
        // traverse  down the tree starting from this point via the right node till the node has no left node left .Then print it
        if(right!=null){
             right.printInOrderTraversal();
        }
    }
    // preorder = Root , Left, Right 
     public void prinPrenOrderTraversal(){
        System.out.print(data + " ");
        // traverse till the node has no left node left .Then print it
        if(left!=null){
            left.prinPrenOrderTraversal();
        }        
        // traverse  down the tree starting from this point via the right node till the node has no left node left .Then print it
        if(right!=null){
             right.prinPrenOrderTraversal();
        }
    }
     // postorder = Left, Right, Root 
     public void prinPostnOrderTraversal(){       
        // traverse till the node has no left node left .Then print it
        if(left!=null){
            left.prinPostnOrderTraversal();
        }        
        // traverse  down the tree starting from this point via the right node till the node has no left node left .Then print it
        if(right!=null){
             right.prinPostnOrderTraversal();
        }
         System.out.print(data + " ");
    }
}


 