import java.util.*;
class Solution {
    public String solution(String myString) {
        // 아스키코드 접근 
        char[] arr = myString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ('l' > arr[i]) {
                arr[i] = 'l';
            }
        }
        
        String result = new String(arr);
        return result;
    }
}