package StacksAndQueues;
/**
 Example 3: 844. Backspace String Compare
Given two strings s and t, return true if they are equal when both are typed into empty text editors. 
'#' means a backspace character.

For example, given s = "ab#c" and t = "ad#c", return true.
Because of the backspace, the strings are both equal to "ac".
*/

public class backspaceComparison {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    public String build(String str) {
        StringBuilder stack = new StringBuilder();
        for(char c : str.toCharArray()){
                if(c!='#'){
                    stack.append(c);                        // if no backspace character encountered
                }
                else if(stack.length()>0) {
                    stack.deleteCharAt(stack.length()-1);   // if backspace character encountered, delete the previous character
                }
            }
        return stack.toString();
    }
}
