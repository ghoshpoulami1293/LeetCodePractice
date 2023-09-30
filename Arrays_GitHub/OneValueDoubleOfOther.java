/*Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]

*/package Arrays_GitHub;
public class OneValueDoubleOfOther {   


    public boolean checkIfExist(int[] arr) {
       if(arr.length<1){
           return false;
       } 
        else{
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr.length; j++)
                  {
                   if(arr[i] == arr[j]*2 && i!=j){
                    return true;
                  }
                }
            }
        }
        return false;
    }
}