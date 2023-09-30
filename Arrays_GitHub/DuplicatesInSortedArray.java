/*Given an integer array nums sorted in non-decreasing order, 
remove the duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same. Then return the number of unique elements in nums.*/
package Arrays_GitHub;
public class DuplicatesInSortedArray {
    public int removeDuplicates(int[] nums) {
        
        int index =0;
        int i =0;
        
        //1st value is always unique
        nums[index]= nums[i];
        index++;
        
        // compare the remaining elements against 1st value
        for(int j=1; j<nums.length;j++){
          // val = 1st element
          int val = nums[i];
          //if element equal, skip.
          /*if element not equal,add to nums[index], increment index and i
                As it is a sorted array, 
                    so once the ocurrances of duplicate value for one element end,
                    that element will no longer pop up, so change comparison value*/
          if(nums[j]!= val)
            {             
              nums[index]=nums[j];
              index++;
              i++;              
            }
        }
        return index;
    }
}
