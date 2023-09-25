package SelectionSort;
public class SelectionSort {
     public static void main(String args[]){      
      int[] array={3,5,9,8,2,6,1,4,0};
        //print the initial array 
        System.out.println("Initial array = " );     
        printarray(array);
        sortBySelectionSort(array);      
    }
     private static void printarray(int[] array) {
        for(int i=0;i<array.length;i++ ){
            System.out.print(array[i] + " ");
        }
    }
    //Selection Sort algorithm
    public static void sortBySelectionSort(int[] array) {
        for(int i =0; i<array.length-1; i++){
            int iterationMinimum = i;

            for(int j=i+1; j<array.length ; j++){
                if(array[j]<array[iterationMinimum]){
                    iterationMinimum =j;
                }
            } 
            if(iterationMinimum!=i){
                    swap(array, i, iterationMinimum);
                }           
            }
        
      //print the sorted array 
      System.out.println("\nSorted array = " );  
      printarray(array);
    }
    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left]=array[right];
        array[right]=temp;  
    }  
}
