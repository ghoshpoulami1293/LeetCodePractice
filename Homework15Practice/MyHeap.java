package Homework15Practice;

import java.util.Arrays;
import java.util.Comparator;

public class MyHeap<T> implements Heap<T> {
    private Object[] array;
    private int size;
    private Comparator<T> comparator;

    public MyHeap() {
       this(null);
    }

    public MyHeap( Comparator<T> comparator) {
        this.array = new Object[10];
        this.size = 0;
        this.comparator = comparator;
    }

    @Override
    public void add(T value) {
        if(array.length == size){
            array= Arrays.copyOf(array, size*2);
        }
        array[size]= value;
        siftUp(array,size-1);
        size++;
    }

    private void siftUp(Object[] array, int index) {
        int parent = (index-1)/2;
        while(compare((T)array[parent],(T)array[index])>0)        //min heap : parent > child --> swap
            {  
               swap(array, index, parent);
               index = parent;
               parent =  (index-1)/2;
             }
    }

    private void swap(Object[] array, int from, int to) {
        if(from != to) {
            T tmp = (T)array[from];
            array[from] = (T)array[to];
            array[to] = tmp;
        }
    }   

    private int compare(T a, T b) {
        if(comparator==null){                                   // of comparator not provided, use this
            Comparable<T> comparableA = (Comparable<T>) a;
            Comparable<T> comparableB = (Comparable<T>) b;
            return comparableA.compareTo((T)comparableB);
        }
        return comparator.compare(a, b);                        // refer to the string Comparator

    }

    @Override
    public T remove() {
       T value = (T)array[0];
       size--;

       array[0]= array[size];
       array[size] = 0;
       siftDown(array,size);

       return value;
    }

    private void siftDown(Object[] array, int index) {
        int from , to;
        to=0;
        do{
            from = to;
            int left = (2* index +1 );
            int right = left+1;
            if(left<size && (compare((T)array[left], (T)array[to])<0)) {        //parent > leftchild   --> swap
                to = left;
            } 
            else if(right<size && (compare((T)array[right], (T)array[to])<0)){  //parent > rightchild   --> swap 
                to= right;
            }
            swap(array, from, to);

        }while(from!=to);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T peek() {
       return (T)array[0];
    } 
    
    @Override
    public String toString() {
        return "MyHeap [array=" + Arrays.toString(array) + ", size=" + size + ", comparator=" + comparator + "]";
    }  
}
