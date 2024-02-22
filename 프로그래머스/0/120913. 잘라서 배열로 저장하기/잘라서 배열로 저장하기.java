import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        // substring 0 - n까지 0 - n-1
        
        int length = 0;
        if (my_str.length() >= n) {
            length = my_str.length() / n;
            if (my_str.length() % n != 0) {
                length++;
            }
        }
        
        int cnt = 0;
        String[] result = new String[length];
        
        for (int i = 0; i < my_str.length(); i += n) {
            
            if (cnt+1 < length){
                result[cnt] = my_str.substring(i, i+n);
                cnt++;
                
            } else {
                result[cnt] = my_str.substring(i, my_str.length());
            }
            
        }
        
        return result;
    }
}