import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        
        int length = (my_string.length() / m);
        char[] temp = new char[length];
        int index = 0;
        
        for (int i = c - 1; i < my_string.length(); i+=m) {
            temp[index] = my_string.charAt(i);
            index++;
        }
        
        String result = new String(temp);
        return result;
        
    }
}