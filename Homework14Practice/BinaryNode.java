package Homework14Practice;

import java.util.Comparator;

import Classwork14Practice.Visitor;

public class BinaryNode<T> implements BinarySearchTree<T>{
    private BinaryNode<T> right;
    private BinaryNode<T> left;

    private BinaryNode<T> root;
    private T value;

    private int size;

    private Comparator<T> comparator;
    
    public BinaryNode(T value, Comparator<T> comparator) {  
        this.value = value;
        this.comparator = comparator;
        this.size=0;
        this.root=null;
    }

    public BinaryNode(T value) { 
        this.comparator = null;
        this.value = value;
        this.size=0;
        this.root=null;
    }
    
     public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public BinaryNode<T> getRight() {
        return right;
    }
    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }
    public BinaryNode<T> getLeft() {
        return left;
    }
    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }
   
    public Comparator<T> getComparator() {
        return comparator;
    }
    public void setComparator(Comparator<T> comparator) {
        this.comparator = comparator;
    }
    

    @Override
    public void insert(T value) {
     if(root == null){
        root = new BinaryNode(value);
        size++;                   // set the root once and for all as the 1st element
     }else{
        binaryInsert(root,value);
        size++;                       // consequetive values need to be compared with this root and inserted 
     }
    }

    public void binaryInsert(BinaryNode<T> root, T value) {
        if(compare(root.getValue(),value)>0){                        //pokemon compartor checks in desc order. Therefore > 0
            BinaryNode<T> leftNode = root.getLeft();
            if(leftNode!=null){
                binaryInsert(leftNode, value);
            }else root.setLeft(new BinaryNode<T>(value, comparator));
        }
         BinaryNode<T> rightNode = root.getRight();
            if(rightNode!=null){
                binaryInsert(rightNode, value);
            }else root.setRight(new BinaryNode<T>(value, comparator));
    }

    public int compare(T a, T b) {
        if(comparator==null){
            Comparable<T> comparable = (Comparable<T>) a;
            return comparable.compareTo(b);
        }
        return comparator.compare(a, b);
    }

    @Override
    public boolean search(T target) {
       return binarySearch(root, target);                       // search based on root to elimate have teh nodes 
    }

    public boolean binarySearch(BinaryNode<T> root, T target) {
        if(root ==null){
            return false;
        }
        else if(compare(root.getValue(), target)==0){
            return true;
        }
        else if(compare(root.getValue(), target)>0){
           return binarySearch(root.getLeft(), target);
        }
        else return binarySearch(root.getRight(), target);
    }
    @Override
    public int size() {
       return size;
    }

    @Override
    public void infixTraversal(Homework14Practice.Visitor<T> visitor) {
       if(left!=null){
        left.infixTraversal(visitor);
       }
       visitor.visit(this);
       if(right!=null){
        right.infixTraversal(visitor);
       }
    }
}
