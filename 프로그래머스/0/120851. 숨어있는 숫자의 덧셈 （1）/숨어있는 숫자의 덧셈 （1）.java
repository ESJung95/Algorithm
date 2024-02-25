import java.util.*;
class Solution {
    public int solution(String my_string) {
        
        my_string = my_string.toLowerCase();
        // 아스키 코드값이 48 ~ 57
        char[] arr = my_string.toCharArray();
        int result = 0;
        for (char item : arr) {
            if ((int)item > 47 && (int)item < 58) {
                result += Integer.parseInt(String.valueOf(item));
            }
        }

        return result;
    }
}