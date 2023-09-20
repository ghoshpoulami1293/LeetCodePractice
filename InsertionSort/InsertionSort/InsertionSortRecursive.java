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
        return null;
    } 
}
