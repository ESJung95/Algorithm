class Solution {
    public int solution(int n) {
        
        int cnt = 0;
        int result = 0;
        for (int i = 4; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt >= 3) {
                result ++;
            }         
            cnt = 0;
            
        }
        
        return result;
    }
}