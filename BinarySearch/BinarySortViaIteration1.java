package BinarySearch;
import java.util.Scanner;

public class BinarySortViaIteration1 {
    public static void main(String args[]){
        int[] array={10,12,14,15,17,18,19,21,25,26,28,29};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search");
        int input = scanner.nextInt();

        boolean result= binarySearchIteration(array,input);
        System.out.println(result);
        scanner.close();
    }

    private static boolean binarySearchIteration(int[] array, int input) {
        int left = 0;
        int right = array.length-1;
        
        while(left <=right){
                int mid = left + ((right-left)/2);
                if(array[mid]==input){
                    return true;
                }else if(input<array[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }        
         }
         return false;
    }
}
