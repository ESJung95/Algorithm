import java.util.*;
class Solution {
    public int solution(String s) {
        
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        int cnt = 0;
        int result = 0;
        
        while(cnt < arr.length) {
            
            flag = true;
            // 올바른 괄호인지 확인하기
            for (int i = 0; i < arr.length; i++) {
                if (stack.isEmpty()) {
                    if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                        stack.push(arr[i]);
                    } else {
                        flag = false;
                        break;
                    }
                } else {
                    if (stack.peek() == '[') {
                        if (arr[i] == ']') {
                            stack.pop();
                        } else {
                            stack.push(arr[i]);
                        }
                    } else if (stack.peek() == '{') {
                        if (arr[i] == '}') {
                            stack.pop();
                        } else {
                            stack.push(arr[i]);
                        } 
                    } else if (stack.peek() == '(') {
                        if (arr[i] == ')') {
                            stack.pop();
                        } else {
                            stack.push(arr[i]);
                        }
                    } else {
                        stack.push(arr[i]);
                    }
                }
            }
            
            if (stack.isEmpty() && flag) {
                result++;
            }
            cnt++;
            
            // 한칸씩 밀기
                
            char temp = '*';
            temp = arr[0];
            
            for (int j = 1; j < arr.length; j++) {
                arr[j-1] = arr[j];
            }   
            
            arr[arr.length-1] = temp;
            
        }
        
        return result;
    }
}