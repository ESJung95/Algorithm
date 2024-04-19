import java.util.*;

public class Solution {
    public int solution(int[][] sizes) {
       
        int maxWidth = 0;
        int maxHeight = 0;

        // 가로 길이와 세로 길이를 각각 모은 배열 생성
        for (int i = 0; i < sizes.length; i++) {
            int width = Math.max(sizes[i][0], sizes[i][1]); // 가로
            int height = Math.min(sizes[i][0], sizes[i][1]); // 세로

            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }

        
        int result = maxWidth * maxHeight;

        return result;
    }
}
