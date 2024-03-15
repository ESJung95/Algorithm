import java.util.*;
class Solution {
    public int solution(int[] order) {
        
        int index = 0;
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= order.length; i++) {
            if (order[index] != i) {
                stack.push(i);
            } else {
                index++;
                result++;
            }
            
            while (true) {
                if (!stack.isEmpty() && stack.peek() == order[index]) {
                    stack.pop();
                    index++;
                    result++;
                } else {
                    break;
                }
            }
        }
        
        return result;
    }
}