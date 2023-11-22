package StacksAndQueues;

import java.util.Stack;

/**
Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, 
convert it to the simplified canonical path.

In a Unix-style file system, a period '.' refers to the current directory, a double period '..' 
refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. 
For this problem, any other format of periods such as '...' are treated as file/directory names.

The canonical path should have the following format:

The path starts with a single slash '/'.
Any two directories are separated by a single slash '/'.
The path does not end with a trailing '/'.
The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
Return the simplified canonical path.
 */
class SimplifyPath {
    class Solution {
        public String simplifyPath(String path) {
    
            // Initialize a stack
            Stack<String> stack = new Stack<String>();
            String[] components = path.split("/");
    
            // Split the input string on "/" as the delimiter
            // and process each portion one by one
            for (String directory : components) {
    
                // A no-op for a "." or an empty string
                /**
                 * If the current component is a . or an empty string, we will do nothing and simply continue. 
                 * Well if you think about it, the split string array for the string /a//b would be [a,,b]. 
                 * yes, that's an empty string in between a and b. 
                 * Again, from the perspective of the overall path, it doesn't mean anything.
                 */
                if (directory.equals(".") || directory.isEmpty()) {
                    continue;
                }
                else if (directory.equals("..")) {
    
                    // If the current component is a "..", then
                    // we pop an entry from the stack if it's non-empty
                    /*
                     * If we encounter a double-dot .., we have to do some processing. 
                     * This simply means go one level up in the current directory path. 
                     * So, we will pop an entry from our stack if it's not empty.
                     */
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
    
                    // Finally, a legitimate directory name, so we add it
                    // to our stack
                    stack.add(directory);
                }
            }
    
            // Stich together all the directory names together
            StringBuilder result = new StringBuilder();
            for (String dir : stack) {
                result.append("/");
                result.append(dir);
            }
    
            return result.length() > 0 ? result.toString() : "/" ;
        }
    }   
 } 
     
