package Homework12Practice;

public interface Queue<E> {
    void enqueue(E value);
    E dequeue();
    int size();
    E peek();
}
