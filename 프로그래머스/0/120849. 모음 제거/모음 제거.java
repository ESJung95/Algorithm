import java.util.*;
class Solution {
    public String solution(String my_string) {
        // 1. 아스키 코드로 접근
        // 2. 반복문으로 제거
        
        char[] arr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u') {
                sb.append(arr[i]);
            }
        }
        
        return sb.toString();
    }
}