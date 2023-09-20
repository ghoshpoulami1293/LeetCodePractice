package InsertionSort;

import java.util.Scanner;

public class InsertionSortRecursive {
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
    private static int[] insertionSortCalculation(int[] array, int length) {
       if(length<=1){
         return array;
       }else{
         insertionSortCalculation(array, length-1);
       int temp = array[length-1];
       int j= length-2;
       while(j>=0 && array[j]>temp){
            array[j+1]=array[j];
            j--; 
        }
        array[j+1]=temp;        
       }
      return array;
    }     
 }
