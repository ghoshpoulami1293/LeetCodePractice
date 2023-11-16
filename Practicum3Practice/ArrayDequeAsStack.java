package Practicum3Practice;

import java.util.ArrayDeque;
import java.util.Deque;
//push and pop methods
public class ArrayDequeAsStack {
     public static void main(String[] args)
    {
 
        // Creating an ArrayDeque to use
        // as a Stack
        Deque<Integer> stack = new ArrayDeque<Integer>();
 
        // Inserting elements in the Stack
        // using push() operation
        stack.push(17);
        stack.push(19);
        stack.push(15);
 
        // Printing the elements
        System.out.println("Stack after insertion: "
                           + stack);
 
        // Removing elements from the Stack
        // using pop() operation
        stack.pop();
        System.out.println("Stack after deletion: "
                           + stack);
 
        stack.pop();
        System.out.println("Stack after deletion: "
                           + stack);
    }
}
