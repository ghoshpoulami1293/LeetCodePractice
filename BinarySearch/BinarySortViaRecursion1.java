package BinarySearch;
import java.util.Scanner;

public class BinarySortViaRecursion1 {
    public static void main(String args[]){
        int[] array={10,12,14,15,17,18,19,21,25,26,28,29};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search");
        int input = scanner.nextInt();

        boolean result= binarySearchRecursion(array,input);
        System.out.println(result);
        scanner.close();
    }

    public static boolean binarySearchRecursion(int[]array,int input){
            return binarySearchRecursion(array, input, 0 , array.length-1);
        
        }

    private static boolean binarySearchRecursion(int[] array, int input, int left, int right) {
        if(left>right){
             return false;
        }
        int mid = left + ((right-left)/2);
        if(array[mid]==input){
            return true;
        }else if(input<array[mid]){
            return binarySearchRecursion(array, input, left, mid-1);
        }
        else{
           return binarySearchRecursion(array, input, mid+1, right);
        }        
    }
}
    

