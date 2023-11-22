package StacksAndQueues;
import java.util.Map;
import java.util.Stack;
import java.util.HashMap;

/*
Example 1: 20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid. The string is valid if all open brackets are closed by
the same type of closing bracket in the correct order, and each closing bracket closes exactly one open bracket.
For example, s = "({})" and s = "(){}[]" are valid, but s = "(]" and s = "({)}" are not valid.
*/

public class validParentheses {
    public boolean isValid(String s){
        Map<Character,Character> match = new HashMap<Character,Character>();
        match.put('{', '}');
        match.put('(', ')');
        match.put('[', ']');    

    Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()){
            if(match.containsKey(c)){
                stack.push(c);
            }
            else {                  // closing paarnthesis is encountered
                if(stack.empty()){  // stack is empty means there is no corresponding opening parenthesis for the current closing parenthesis
                    return false;   // so return false.
                }

                char previousString = stack.pop(); 
                if(match.get(previousString) != c){     // the corresponding value for the key does not match, so return false
                    return false;
                }            
            }        
        }
        return stack.empty();
    }    
}
