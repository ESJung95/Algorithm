import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        // 사전 순으로 배열..?
        String[] result = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            result[i] = my_string.substring(i, my_string.length());
        }
        
        Arrays.sort(result);
        return result;
    }
}