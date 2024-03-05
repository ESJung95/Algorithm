import java.util.*;
class Solution {
    public int solution(String s) {
        
        int result = 0;
        char[] arr = s.toCharArray();
        char start = arr[0];
        int same = 0;
        int diff = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (start == arr[i]) {
                same++;
            } else {
                diff++;
            }
            
            if (same == diff) {
                start = arr[i+1];
                result++;
                same = 0;
                diff = 0;
            }
        }
        
        return result + 1;
    }
}