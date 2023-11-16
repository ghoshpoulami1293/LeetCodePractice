package Homework15Practice;

public interface Queue<T> {
    void enqueue(T value);
    T dequeue();
    int size();
    T peek();
}
