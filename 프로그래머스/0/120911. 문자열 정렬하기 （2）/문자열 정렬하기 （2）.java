import java.util.*;
class Solution {
    public String solution(String my_string) {
        
        my_string = my_string.toLowerCase();
        char[] arr = my_string.toCharArray();
        Arrays.sort(arr);
        String result = new String(arr);
        return result;
    }
}