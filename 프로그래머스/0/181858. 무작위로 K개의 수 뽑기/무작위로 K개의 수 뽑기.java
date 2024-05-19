import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        
        for (int item : arr) {
            set.add(item);
        }
        
        int[] result = new int[k];
        Arrays.fill(result, -1); // 결과 배열을 -1로 초기화
        
        Iterator<Integer> iterator = set.iterator();
        
        for (int i = 0; i < Math.min(k, set.size()); i++) {
            if (iterator.hasNext()) {
                result[i] = iterator.next();
            }
        }
        
        return result;
    }
}