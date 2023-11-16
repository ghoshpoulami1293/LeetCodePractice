package Homework14Practice;

public interface BinarySearchTree<T> {
    void insert(T value);
    boolean search(T target);
    void infixTraversal(Visitor<T> visitor);
    int size();
}
