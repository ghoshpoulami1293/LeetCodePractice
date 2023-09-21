package MergeSort;

import java.util.Scanner;

public class MergeSort {
    public static void main(String args[]){
        int[] array =new int[10];
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an array = ");
        for (int i=0; i<array.length; i++){
           array[i]= scanner.nextInt();
        }
       int sortedarray[] =  mergeSortHelperMethod(array);

       System.out.println("The sorted array is = ");
       for(int i : sortedarray){
        System.out.print(i +" ");
       }
        
        scanner.close();
    }

    //calls the merge sort method
    public static int[] mergeSortHelperMethod(int[] array){
        return mergeSort(array, new int[array.length], 0, array.length-1);
    }

    private static int[] mergeSort(int[] array, int[] temp, int leftStart, int rightEnd) {
        if(leftStart>=rightEnd){
            return array;
        }
        //to divide the array in halves
        int middlepoint = ((leftStart + rightEnd)/2);

        //recurcive calls to mergesort method to split further into halves
            mergeSort(array, temp, leftStart, middlepoint);
            mergeSort(array, temp, middlepoint+1, rightEnd);

        //Merge back together the split arrays
        merge(array,temp, leftStart,rightEnd);
        return array;       
     }    

    public static void merge(int[] array, int[] temp, int leftStart, int rightEnd){

        //defining leftEnd , rightEnd , index for the temporary array used for the merge    
        int leftEnd =((leftStart + rightEnd)/2);
        int rightStart = leftEnd +1;
        int size = rightEnd - leftStart + 1;

        //initializing counters to be used in the while loop
        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        //sorting and filling up temporary array
        //while array is within bounds:
            while(left<=leftEnd && right<=rightEnd){
                if (array[left]<=array[right]){
                    temp[index]= array[left];
                    left++;
                }
                else{
                    temp[index]= array[right];
                    right++;
                }
                index++;
            }

        //when elements may be left in one of the array 
            //Copy from array : array , from left ; copy to array: temp, starting from index ; and give the size of the leftover elements
            System.arraycopy(array, left, temp, index, (leftEnd - left +1));
            //Copy from array : array , from right ; copy to array: temp, starting from index ; and give the size of the leftover elements
            System.arraycopy(array, right, temp, index, (rightEnd-right +1));
            //Now, copy everything from temp array back to the main array: array
            System.arraycopy(temp, leftStart, array, leftStart, size);
    }    
}
