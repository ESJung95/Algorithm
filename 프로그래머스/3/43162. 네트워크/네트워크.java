import java.util.*;
class Solution {
    
    static boolean[] visited;
    
    public void dfs(int i, int computers[][], int n) {
        visited[i] = true;
        
        for(int j = 0; j < n; j++) {
            if(!visited[j] && computers[i][j] == 1) {
                dfs(j, computers, n);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        
        int result = 0;
        visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                result ++;
                dfs(i, computers, n);
            }
        }
        
        return result;
    }
}