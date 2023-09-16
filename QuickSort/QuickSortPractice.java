package QuickSort;

public class QuickSortPractice {

    public static void main(String args[]){      
      int[] array={3,5,9,2,8,6,1,4,0};  

      //print the initial array 
        System.out.println("Initial array = " );     
        printarray(array);

      QuickSortPractice quickSortPractice = new QuickSortPractice();
      quickSortPractice.sortByQuickSort(array);

      //print the sorted array 
      System.out.println("\nSorted array = " );
      printarray(array);      
    }

    //utility method for printing the array
    private static void printarray(int[] array) {
        for(int i=0;i<array.length;i++ ){
            System.out.print(array[i] + " ");
        }
    }
    private void sortByQuickSort(int[] array) {    
    //sending the right parameters for calculation using an iterim method
        calculateUsingQuickSort(array,0,array.length-1);     
    }

    private void calculateUsingQuickSort(int[] array, int left, int right) {        
        //1st clause to terminate, >= "=" very important otherwise infinite loop
            if(left>=right){
                return;
            }
            else{
                 //select pivot element
                    int pivotElement=array[((left + right)/2)];

                //call a method to partition into left and right half and return the new index for the partition
                    int indexForPartition = partitionMethod(array, left, right, pivotElement);

                //Quicksort on left partition - recursion
                    calculateUsingQuickSort(array, left, indexForPartition-1);
                //Quicksort on right partition - recursion
                    calculateUsingQuickSort(array, indexForPartition, right);
            }
        
         }
    private int partitionMethod(int[] array, int left, int right, int pivotElement) {
        while(left<=right){
            //compare left side element with pivot, if lesser, move ahead
                while(array[left] < pivotElement){
                    left++;
                }
            //compare left side element with pivot , if greater, move ahead
                while(array[right] > pivotElement){
                    right--;
                }
            // if the condition is such that :
            // left element is greater - so we have the value of left in this case, 
            // and right element is smaller - so we have the value of right in this case, 
            // and left partition value is lesser than or equal to right partition value -very imp,if less than only,doesnt work
            // - then swap           
                if(left <= right){
                swap(array, left, right);
                //then adjust the left and right partition values , 
                //left index moves ahead by 1, right index value lowers by 1
                left ++;
                right--;
            }            
        }
            //left value holds the partition point index
            return left;       
    }
    //swapping elements in the array
    private void swap(int[] array, int left, int right) 
    {
        int tmp = array[left]; 
        array[left] = array[right]; 
        array[right] = tmp;           
    } 
}