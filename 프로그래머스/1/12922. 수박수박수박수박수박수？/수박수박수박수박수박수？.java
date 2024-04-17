import java.util.*;
class Solution {
    public String solution(int n) {
        
        String soo = "수"; // 홀
        String bak = "박"; // 짝
        StringBuilder result = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                result.append(soo);
            } else {
                result.append(bak);
            }
        }
        
        return result.toString();
    }
}