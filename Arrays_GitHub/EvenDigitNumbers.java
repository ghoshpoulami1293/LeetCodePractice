//Given an array nums of integers, return how many of them contain an even number of digits.
package Arrays_GitHub;

public class EvenDigitNumbers {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for(int i =0; i< nums.length;i++){
            String number = String.valueOf(nums[i]);
            int numberSize = number.length();
            
            if(numberSize%2==0){
                count++;
            }  
        }
        return count;
    }
}