package Homework15Practice;

import java.util.Comparator;

public class PriorityQueue<T> implements Queue<T>{
    private MyHeap<T> myHeap;
    
    public PriorityQueue() {
        this.myHeap = null;
    }

     public PriorityQueue(Comparator<T> comparator) {
        this.myHeap = new MyHeap<>(comparator);
    }

    @Override
    public void enqueue(T value) {
        myHeap.add(value);
    }

    @Override
    public T dequeue() {
       return myHeap.remove();
    }

    @Override
    public int size() {
        return myHeap.size();
    }

    @Override
    public T peek() {
        return myHeap.peek();
    }    
}
