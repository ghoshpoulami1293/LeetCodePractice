package Practicum3Practice;

import java.util.ArrayDeque;
import java.util.Deque;
//add and remove methods
public class ArrayDequeAsQueue {
    public static void main(String[] args)
    {
 
        // Creating a Queue using ArrayDeque
        Deque<Integer> queue = new ArrayDeque<Integer>();
 
        // Adding the elements to the Queue
        queue.add(15);
        queue.add(17);
        queue.add(22);
 
        // Printing the elements of the Queue
        System.out.println("Queue after insertion: "
                           + queue);
 
        // Removing elements from the queue
        queue.remove();
        System.out.println("Queue after deletion: "
                           + queue);
        queue.remove();
        System.out.println("Queue after deletion: "
                           + queue);
    }
}
