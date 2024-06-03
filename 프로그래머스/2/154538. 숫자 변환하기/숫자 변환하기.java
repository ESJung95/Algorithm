import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        if (x == y) return 0;  // 시작과 목표가 같으면 연산 필요 없음
        
        Queue<int[]> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.add(new int[]{x, 0});
        visited.add(x);
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentValue = current[0];
            int steps = current[1];
            
            // 가능한 다음 단계 값 생성
            int[] nextValues = {currentValue + n, 2 * currentValue, 3 * currentValue};
            
            for (int nextValue : nextValues) {
                if (nextValue == y) {
                    return steps + 1;  // 목표값에 도달했을 때
                }
                
                if (nextValue < y && !visited.contains(nextValue)) {
                    queue.add(new int[]{nextValue, steps + 1});
                    visited.add(nextValue);
                }
            }
        }
        
        return -1;  // 목표값에 도달할 수 없는 경우
    }
}
