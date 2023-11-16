package Homework12Practice;

import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {
    public final int initializeSize=2;
    Object[] array;
    int size;
    

    public ArrayStack() {
        this.array = new Object[initializeSize];
        this.size = 0;
    }

    @Override
    public void push(E value) {
        if(size == array.length){                    //if array is full
            array = Arrays.copyOf(array, size*2);    // double teh size of the array
        }
        array[size]=value;
        size++;       
    }

    @Override
    public E pop() {
        if(size == 0){
            return null;
        }
        E value = (E)array[size-1];                //return value in last index
        size--;
        return value;
    }

    @Override
    public int size() {
       return this.size;
    }

    @Override
    public E peek() {
        if(array.length == 0){
            return null;
        }
       return (E)array[size-1];                    //return value in last index
    }
    
}
