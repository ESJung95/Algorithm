import java.util.*;
class Solution {
    public int[][] solution(int n) {
        int[][] result = new int[n][n];
        // i == j면 1 나머지는 0
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (i == j) {
                    result[i][j] = 1;
                }
                // } else {
                //     result[i][j] = 0;
                // }
            }
        }
        
        return result;

    }
}