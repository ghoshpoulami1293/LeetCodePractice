package Practicum3Practice;

public class MaxHeapToMinHeap {
    
    //convert to maxHeap
    public static void MinHeapify(int array[], int index, int size)
    {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        int parentNode = index;

        if (leftChild < size && array[leftChild] < array[parentNode])   //leftchild < parent -->swap
            parentNode = leftChild;

        if (rightChild < size && array[rightChild] < array[parentNode]) //rightchild < parent -->swap
            parentNode = rightChild;

        if (parentNode != index) {
            //swap parent and child            
            int temp = array[index];
            array[index] = array[parentNode];
            array[parentNode] = temp;
            MinHeapify(array, parentNode, size);
        }
    }

    // This function basically builds max heap ustilizing reverse siftDown of MinHeap
    public static void convertMaxHeap(int array[], int size)
    {
        for (int index = (size - 2) / 2; index >= 0; --index) //represents the index of the last internal node
            MinHeapify(array, index, size);
    }

    public static void printArray(int array[], int size)
    {
        for (int i = 0; i < size; ++i)
            System.out.print(array[i] + " ");
    }
 // driver's code
 public static void main(String[] args)
 {
     // arrayay representing Min Heap
     int array[] = {20,18,10,12,9,9,3,5,6,8};
     int size = array.length;

     System.out.print("Max Heap array : ");
     printArray(array, size);

     // Function call
     convertMaxHeap(array, size);

     System.out.print("\nMin Heap array : ");
     printArray(array, size);
 }
}
