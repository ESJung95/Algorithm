import java.util.*;
class Solution {
    boolean solution(String s) {
        
        boolean result = false;
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                if (arr[i] == '(') {
                    stack.push(arr[i]);
                } else {
                    return result;
                }
            } else {
                if (stack.peek() != arr[i]) {
                    stack.pop();
                } else {
                    stack.push(arr[i]);
                }
            }
        }
        
        if (stack.isEmpty()) {
            result = true;
        }

        return result;
    }
}