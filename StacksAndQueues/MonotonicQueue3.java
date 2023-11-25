package StacksAndQueues;
import java.util.ArrayDeque;
/*Example 3: 
1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit
      Given an array of integers nums and an integer limit, return the size of the longest subarray such that
      the absolute difference between any two elements of this subarray is less than or equal to limit. 
*/
public class MonotonicQueue3 {
    
    public int longestSubarray(int[] nums, int limit) {
        ArrayDeque<Integer> increasing = new ArrayDeque<>();
        ArrayDeque<Integer> decreasing = new ArrayDeque<>();
        int left = 0;
        int ans = 0;
        
        for (int right = 0; right < nums.length; right++) {
            // maintain the monotonic deques
            while (!increasing.isEmpty() && increasing.getLast() > nums[right]) {
                increasing.removeLast();
            }
            while (!decreasing.isEmpty() && decreasing.getLast() < nums[right]) {
                decreasing.removeLast();
            }
            
            increasing.addLast(nums[right]);
            decreasing.addLast(nums[right]);
            
            // maintain window property
            while (decreasing.getFirst() - increasing.getFirst() > limit) { //compare the 1st element of monotonic incr and decr
                if (nums[left] == decreasing.getFirst()) { // if that is the 1st element
                    decreasing.removeFirst();
                }
                if (nums[left] == increasing.getFirst()) {
                    increasing.removeFirst();
                }
                left++; // to shrink the window
            }
            
            ans = Math.max(ans, right - left + 1);
        }
        
        return ans;
    }
}

