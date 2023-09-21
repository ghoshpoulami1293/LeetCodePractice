package BubbleSort;
import java.util.Scanner;

public class BubbleSortHR {
      public static void main(String args[]){
        int[] array =new int[5];
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an array = ");
        for (int i=0; i<array.length; i++){
           array[i]= scanner.nextInt();
        }
       int sortedarray[] =  bubbleSortHelperMethod(array);

       System.out.println("The sorted array is = ");
       for(int i : sortedarray){
        System.out.print(i +" ");
       }        
        scanner.close();
    }
    private static int[] bubbleSortHelperMethod(int[] array) {
        if(array.length<=1){
            return array;
        }
       
       boolean isSorted = false;
       int lastSortedElement = array.length -1;


       while(!isSorted){
        isSorted = true;
         for(int i= 0; i<lastSortedElement; i++){
                if(array[i]>array[i+1]){
                    swap(array, i , i+1);  
                    isSorted = false;              
                }
            }
                lastSortedElement --;
                    
       }     
        return array;
    }
    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left]=array[right];
        array[right]=temp;  
    }  
}
