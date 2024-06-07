import java.util.*;
class Solution {
    public int solution(int[] order) {
        
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int index = 0;
        for (int i = 1; i <= order.length; i++) { // box
            if (order[index] != i) {
                stack.push(i);
            } else {
                result++;
                index++;
            }
            
            while(!stack.isEmpty() && stack.peek() == order[index]) {
                stack.pop();
                result++;
                index++;
            }
        }
        
        return result;
    }
}