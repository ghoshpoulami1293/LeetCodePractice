/*Given an array of integers arr, return true if and only if it is a valid mountain array.
*/
package Arrays_GitHub;
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int iMax=0;
        if(arr.length<3){
            return false;
        }
        
        else {
                for(int i=0; i<arr.length-1;i++){                 
                     if(arr[i]==arr[i+1]){
                       return false;            
                      }
                     
                     else if(arr[i]<arr[i+1]){                        
                        iMax++;                     
                      }
                 }
                
                if(iMax==0 || iMax ==arr.length-1){
                    return false;
                    }
                
                for(int i=iMax ; i<arr.length-1;i++){
                    if(!(arr[i]>arr[i+1])){
                        return false;
                        }
                }
            }
            return true;
        }
}
