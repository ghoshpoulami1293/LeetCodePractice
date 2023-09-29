//Given a binary array nums, return the maximum number of consecutive 1's in the array.
package Arrays_GitHub;

public class NumbeOfConsOnes {
    public int findMaxConsecutiveOnes(int[] nums) {        
        int count =0;
        int maxCount=0;

        for (int i =0; i<nums.length; i++){
            if(nums[i]==1){
                count++;                
            } 
            if(nums[i]==0){
                count=0;
            }
            if(maxCount<count){
                maxCount= count;
            }
        }
        return maxCount;
      } 
}
