package StacksAndQueues;
/*
Example 2: 1047. Remove All Adjacent Duplicates In String
You are given a string s. Continuously remove duplicates (two of the same character beside each other) until you can't anymore. 
Return the final string after this.

For example, given s = "abbaca", you can first remove the "bb" to get "aaca". 
Next, you can remove the "aa" to get "ca". This is the final answer.
*/
public class removeDuplicates{
    public String removeDuplicate(String s) {
        StringBuilder stack = new StringBuilder();
        for(char c : s.toCharArray()){
            if(stack.length() >0 
                    && stack.charAt(stack.length()-1) ==c){ // if the top of the non empty stack matches the incoming character
                
                stack.deleteCharAt(stack.length()-1);
            }
            else{                           // if a different character not equal to the existing character is incoming
                    stack.append(c);        //add on to the stack
            }   
        }
                return stack.toString();
    }
    
}