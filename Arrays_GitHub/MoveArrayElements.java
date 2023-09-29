//Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
package Arrays_GitHub;

public class MoveArrayElements {
    public void duplicateZeros(int[] arr) {        
        for(int i = 0;i <arr.length ; i++){
            if(arr[i] == 0){                
                for (int move= arr.length-1; move>=i+1; move --){
                    if(move+1 > arr.length-1){
                        continue;
                    }else{
                       arr[move+1]= arr[move]; 
                    }
                    
                }
                if(i+1 < arr.length)
                arr[i+1]= 0;
                i++;
            }
        }        
    }
}