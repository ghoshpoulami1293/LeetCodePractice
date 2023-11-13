package Classwork12Practice;

public interface Queue<E> {
    public void enqueue(E value);
    public E dequeue();
    public int size();
    public E peek();
}
