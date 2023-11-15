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
        int value = array[0];       // highest priority element to be removed
        size--;                     // decrementing size for the operation remove , this can also be used as an index.

        array[0]= array[size];      // move element from rightmost bottom(last index) to index 0
        array[size] = 0;            // last index element = 0

        siftDown(array, size);      // to sift down the element from the parent to the child down the tree
        return value;               // return element with highest priority
    }

    private void siftDown(int[] array, int size) {
        int childIndex = 0;
        int parentIndex;

        do{
            parentIndex = childIndex;                                    //parent is now the child- initialize to sift down
            
            int leftChild = (parentIndex * 2)+1;                         //calculate left child
            int rightChild = leftChild + 1;                              //calculate right child

            if(leftChild<size && array[leftChild] < array[childIndex]){  //if left child is within last index and less than present parent
                childIndex = leftChild;                                  //set child index as left child
            }

            if(rightChild<size && array[rightChild] < array[childIndex]){//if right child is within last index and less than present parent
                childIndex = rightChild;                                 //set child index as right child
            }
            swap(array,  parentIndex, childIndex);                       //swap parent and child 
        }while(parentIndex!=childIndex);
    }

    @Override
    public int size() {
      return size;
    }

    

    @Override
    public String toString() {
        return "ArrayHeap [array=" + Arrays.toString(array) + ", size=" + size + "]";
    }

    public static void main(String[] args) {
        Heap heap = new ArrayHeap();
        heap.add(24);
        heap.add(60);
        heap.add(68);
        heap.add(73);
        System.out.println(heap);
        heap.add(10);
        System.out.println(heap);

        while(heap.size()>0){
            System.out.println(heap.remove());
            System.out.println(heap.remove());
            System.out.println(heap.remove());
            System.out.println(heap.remove());
            System.out.println(heap.remove());
        }
    }
}
