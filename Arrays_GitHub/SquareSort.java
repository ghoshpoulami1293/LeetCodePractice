
/*Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach*/

package Arrays_GitHub;
import java.util.Arrays;

public class SquareSort {
 
    public int[] sortedSquares(int[] nums) {
        
         for(int i=0; i<nums.length;i++){
            nums[i]= nums[i] * nums[i];
        }    
        Arrays.sort(nums);  
        return nums;
    }     
}