package BubbleSort;
import java.util.Scanner;

public class BubbleSortSelf {
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
       // iterate through the length of the array - calculate the iterations
       else{
        for (int i=1 ; i< array.length; i++){
        // for each iteration , compare the consecutive elements  - hence iterate from 0th element to one but last element        
            for(int j= 0; j<array.length-1 ; j++){
                if(array[j]>array[j+1]){
                    swap(array, j, j+1);                
                }
            }
         }
       }       
        return array;
    }
    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left]=array[right];
        array[right]=temp;  
    }  
}
