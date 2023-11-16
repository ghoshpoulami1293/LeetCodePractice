package Homework12Practice;

import java.util.Arrays;

public class ArrayQueue<E> implements Queue<E> {
    int front;
    int rear ; 
    int size;
    public final int initialSize =8;
    Object[] array;
  
    public ArrayQueue() {
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        this.array = new Object[initialSize];
    }

    @Override
    public void enqueue(E value) {
        if(array.length>size){
            array= Arrays.copyOf(array,size*2);
        }
        array[size]= value;
        size++;
    }

    @Override
    public E dequeue() {
        if(size==0){
            return null;
        }
        E value = (E) array[0] ;                                       //value to deque

        Object[] tempArray = Arrays.copyOfRange(array, 1, this.size);  //copy from index 1 to the end of the array
        array = Arrays.copyOf(tempArray,array.length-1);               // remove one element and (optional- reduce the size of the array by 1)
        
        size--;
        return value;
    }

    @Override
    public int size() {
       return size;
    }

    @Override
    public E peek() {
        if(size==0){
            return null;
        }
        return (E)array[front];
    }
    
}
