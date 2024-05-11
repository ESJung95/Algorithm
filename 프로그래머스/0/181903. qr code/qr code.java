import java.util.*;
class Solution {
    public String solution(int q, int r, String code) {
        
        StringBuilder sb = new StringBuilder();
        // 시작 r 이동 q
        for (int i = r; i < code.length(); i+=q) {
            sb.append(String.valueOf(code.charAt(i)));
        }
        
        return sb.toString();
        
    }
}