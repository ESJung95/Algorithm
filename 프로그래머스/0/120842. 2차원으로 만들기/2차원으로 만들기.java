import java.util.*;
class Solution {
    public int[][] solution(int[] num_list, int n) {
        
        int[][] result = new int[(num_list.length / n)][n];
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = num_list[index];
                index++;
            }
        }
        
        return result;
    }
}