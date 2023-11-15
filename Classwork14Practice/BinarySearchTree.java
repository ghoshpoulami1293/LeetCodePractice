package Classwork14Practice;

public interface BinarySearchTree {
    void insert(int value);
    boolean search(int target);
    void infixTraversal(Visitor visitor);
    int size();
}
