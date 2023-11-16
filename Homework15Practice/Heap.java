package Homework15Practice;

public interface Heap<T> {
    void add(T value);
    T remove();
    int size();
    T peek();
}
