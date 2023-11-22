package StacksAndQueues;

public class GreatString {
    public String makeGood(String s) {
        StringBuilder stack = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(stack.length()>0 
                    && String.valueOf(stack.charAt(stack.length()-1)).equalsIgnoreCase(String.valueOf(c))
                    && stack.charAt(stack.length() - 1) != c)
            {
                stack.deleteCharAt((stack.length()-1));
            }
            else {
                stack.append(c);
            }
        }
        
        return stack.toString();
    }
}
