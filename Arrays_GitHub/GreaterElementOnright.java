/*
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.
 */
package Arrays_GitHub;

public class GreaterElementOnright {
    
        public int[] replaceElements(int[] arr) {  
        
        //last index 
        int max=-1;  
        //length of input array
        int length=arr.length;
            
            //copy elements into new array
            int[] arrCopy=new int[length];
            
            for(int i=length-1;i>=0;i--){
                
                //copy last element of new array as -1
                //then value of max had changed as that is greater than -1, put that in the previous element                     
                arrCopy[i]=max;
                
                //if element in input array in i th index is greater than max, max= that element
                if(arr[i]>=max){
                    max=arr[i];
                }
            }
            return arrCopy;
        }
    }

