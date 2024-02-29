import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        // 0부터 n번째 까지
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = num_list[i];
        }
        
        return result;
    }
}