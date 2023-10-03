/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
*/
package Arrays_GitHub;
public class MoveZerosToEnd {
    public void moveZeroes(int[] nums) {
        int index =0;
        int val= 0;
        
        for (int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[index]= nums[i];
                index++;
            }
        }
        for(int j=index; j<nums.length;j++){
            nums[j]=0;
        }
    }
}