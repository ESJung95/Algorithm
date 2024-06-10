import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        
        // 문자열을 순회하면서 스택에 삽입
        for (int i = 0; i < number.length(); i++) {
            char current = number.charAt(i);
            
            // 스택에 값이 있고, 스택의 top 값이 현재 값보다 작으면 pop
            while (!stack.isEmpty() && stack.peek() < current && k > 0) {
                stack.pop();
                k--;
            }
            
            // 현재 값 스택에 삽입
            stack.push(current);
        }
        
        // k가 남았을 경우 뒷자리 숫자를 제거
        while (k > 0) {
            stack.pop();
            k--;
        }
        
        // 스택에 있는 숫자를 문자열로 변환
        StringBuilder answer = new StringBuilder();
        while (!stack.isEmpty()) {
            answer.insert(0, stack.pop());
        }
        
        return answer.toString();
    }
}
