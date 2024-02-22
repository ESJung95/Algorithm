import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        // 반복문 돌면서 count
        int cnt = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                cnt ++;
            }
        }
        
        return cnt;
    }
}