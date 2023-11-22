package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class T3000Counter {
      Queue<Integer> queue;
    
    public T3000Counter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }
        
        queue.offer(t);
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

