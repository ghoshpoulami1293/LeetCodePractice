package InsertionSort;

import java.util.Scanner;

public class InsertionsortIterative {
     public static void main(String args[]){
        int[] array =new int[9]; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an array = ");
        for (int i=0; i<array.length; i++){
           array[i]= scanner.nextInt();
        }
        int[] sortedArray = insertionSort(array);
        System.out.println("Sorted array = ");
        for (int i : sortedArray){
            System.out.print(i + " ");
        }  
        scanner.close();   
    }
    private static int[] insertionSort(int[] array) {        
        return insertionSortCalculation(array,array.length);
    }
   
    //without using separate temp variable for comparison with temp vs left elements
    private static int[] insertionSortCalculation(int[] array, int length) {
        if (length<=1){
            return array;
        }
        else{
            
            //start from the 1st index
            for(int i=1;i<array.length;i++){
                //set j = i such that j-1 and j can be compared
                int j=i;

                //starting at index 1 , so j>0
                // compare left value vs right (j-1 th value vs jth value in the array)
                while (j>0 && array[j-1]>array[j]) 
                {
                    //if((j-1 th value > jth value in the array), swap
                    //once swapped, decrement j, so that the newly placed element can be compared with its left value 
                    swap(array, j-1, j);
                    j--;                 
                }
            }
                return array;
        }       
    }
    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left]=array[right];
        array[right]=temp;  
    }  
}
