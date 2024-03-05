import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                int temp = stack.pop();
                if (temp != arr[i]) {
                    stack.push(temp);
                    stack.push(arr[i]);
                } else {
                    stack.push(temp);
                }
            }
        }
        
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}