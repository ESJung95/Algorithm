import java.util.*;
class Solution {
    
    static boolean[] visited;
    static int max = 0;
    
    public void dfs(int k, int[][] dungeons, int cnt) {
        for (int i = 0; i < dungeons.length; i++) {
            int min = dungeons[i][0];
            int use = dungeons[i][1];
            
            if (!visited[i] && k >= min) {
                visited[i] = true;
                
                dfs(k - use, dungeons, cnt+1);
                
                // 다른 케이스를 위해서 방문 취소 처리
                visited[i] = false;
            }
        }
        
        max = Math.max(max, cnt);
    }
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        
        dfs(k, dungeons, 0);
        return max;
        
    }
}