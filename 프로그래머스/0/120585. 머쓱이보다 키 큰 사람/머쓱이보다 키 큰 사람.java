import java.util.*;
class Solution {
    public int solution(int[] array, int height) {
        // 반복문 돌면서 비교
        int cnt = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                cnt++;
            }
        }
        return cnt;
    }
}