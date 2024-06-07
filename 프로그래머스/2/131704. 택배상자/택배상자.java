import java.util.*;

class Solution {
    public int solution(int[] order) {
        int result = 0;
        int n = order.length;
        
        int[] box = new int[n];
        for (int i = 0; i < n; i++) {
            box[i] = i + 1;
        }
        
        Stack<Integer> stack = new Stack<>();
        int boxIndex = 0; // box 배열의 현재 인덱스
        int orderIndex = 0; // order 배열의 현재 인덱스
        
        do {
            if (boxIndex < n && box[boxIndex] == order[orderIndex]) {
                // 박스에서 올바른 순서의 상자를 직접 찾음
                result++;
                orderIndex++;
                boxIndex++;
            } else if (!stack.isEmpty() && stack.peek() == order[orderIndex]) {
                // 스택의 상단에 올바른 순서의 상자가 있는 경우
                stack.pop();
                result++;
                orderIndex++;
            } else {
                // 박스에서 상자를 스택에 쌓음
                if (boxIndex < n) {
                    stack.push(box[boxIndex]);
                    boxIndex++;
                } else {
                    // 더 이상 쌓을 상자가 없는 경우 중지
                    break;
                }
            }
        } while (orderIndex < n);
        
        return result;
    }
}
