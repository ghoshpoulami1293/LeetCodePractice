package Classwork15Practice;

import java.util.Arrays;

//Implementation of Heap using array
// root => index =0 , left child => 2k+1 ,  right child => 2k+2
public class ArrayHeap implements Heap{
    int array[];
    int size;

    public ArrayHeap() {
        this.array = new int[8];
        this.size = 0;
    }

    @Override
    public void add(int value) {
        if(array.length == size){
            array= Arrays.copyOf(array, size*2);            //increase length of the array if full
        }
        array[size]= value;                                 // first add value to the array
        size++;                                             // increment size
        siftUp(array, size-1);                              // pass the array and index to begin sifting up.
    }

    private void siftUp(int[] array, int index) {
        int parentIndex = (index-1)/2;
        while(array[parentIndex]> array[index]){            //for min heap : if parent value> child value => swap
            swap(array, index,parentIndex);                 //swap the parent and chils
            index = parentIndex;                            //change index to parent index to climb up the tree
            parentIndex = (index-1)/2;                      //change parent index to new parent to climb up the tree
        }                             
    }

    private void swap(int[] array, int index, int parentIndex) {
        if(index!=parentIndex){
            int temp=array[index];
            array[index]= array[parentIndex];
            array[parentIndex]= temp;
        }
    }

    @Override
    public int remove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int size() {
      return size;
    }

    
}
