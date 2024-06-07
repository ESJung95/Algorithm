import java.util.*;

class Solution {
    public int solution(int[] order) {
        int result = 0;

        int[] box = new int[order.length];
        for (int i = 0; i < order.length; i++) {
            box[i] = i + 1;
        }

        Stack<Integer> stack = new Stack<>();
        int boxIndex = 0;
        int orderIndex = 0;

        while (orderIndex < order.length) {
            if (boxIndex < order.length && box[boxIndex] == order[orderIndex]) {
                result++;
                orderIndex++;
                boxIndex++;
            } else if (!stack.isEmpty() && stack.peek() == order[orderIndex]) {
                stack.pop();
                result++;
                orderIndex++;
            } else {
                if (boxIndex < order.length) {
                    stack.push(box[boxIndex]);
                    boxIndex++;
                } else {
                    break;
                }
            }
        }

        return result;
    }
}
