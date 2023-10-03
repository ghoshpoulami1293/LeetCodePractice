/*Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.*/
package Arrays_GitHub;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int index=0;
        int val=0;
        int arrayCopy[] =new int[nums.length];
        
        for(int i=0; i<nums.length;i++){
            if(nums[i]%2==0){
                arrayCopy[index]= nums[i];
                nums[i]=0;
                index++;
            }
        }
        for(int j=0; j<nums.length;j++){
            if(nums[j]!=val){
                arrayCopy[index]=nums[j];
                index++;
            }
        }
        return arrayCopy;
    }
}
