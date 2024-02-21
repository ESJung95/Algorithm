import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        // 결과 배열 크기
        int length = 0;
        for (int i = 1; i <= n; i++) {
            length += i;
        }
        
        int[] result = new int[length];
        
        // 삼각형 모양 배열 만들기
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
        }

        // 달팽이 모양으로 이동하기
        int value = 1;
        int row = 0;
        int col = 0;
        int direction = 0;

        while (value <= length) {
            triangle[row][col] = value++;
            if (direction == 0) { // 아래 방향
                if (row + 1 < n && triangle[row + 1][col] == 0) {
                    row++;
                } else {
                    direction = 1;
                    col++; // 열을 증가 = 오른쪽으로 이동
                }
            } else if (direction == 1) { // 오른쪽 방향
                if (col + 1 < triangle[row].length && triangle[row][col + 1] == 0) {
                    col++;
                } else {
                    direction = 2;
                    row--; 
                    col--; // 행과 열이 같이 줄어들면 대각선 안쪽으로 이동!!
                }
            } else if (direction == 2) { // 대각선 방향
                if (triangle[row - 1][col - 1] == 0) {
                    row--;
                    col--;
                } else {
                    direction = 0;
                    row++;
                }
            }
        }
        
        int index = 0;
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                result[index] = triangle[i][j];
                index++;
            }
        }
        
        return result;
    }
}