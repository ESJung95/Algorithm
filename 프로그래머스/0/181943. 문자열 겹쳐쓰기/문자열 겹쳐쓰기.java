import java.util.*;
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        StringBuilder result = new StringBuilder();
        int length = overwrite_string.length();
        String str1 = my_string.substring(0,s);
        result.append(str1);
        result.append(overwrite_string);
        String str2 = my_string.substring(s+length);
        result.append(str2);
        
        return result.toString();
    }
}