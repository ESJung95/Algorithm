import java.util.*;
class Solution {
    public long solution(long n) {
        
        // 큰 것부터 리턴
       long result = 0;
        
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        
        String temp = new String(arr); // 현재 오름차순
        StringBuilder sb = new StringBuilder(temp);
        String resultStr = sb.reverse().toString();
        
        result = Long.parseLong(resultStr);
        return result;
    }
}