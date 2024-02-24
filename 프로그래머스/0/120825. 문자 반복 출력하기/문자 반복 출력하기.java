import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        // 접근 String -> char
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        
        for (String item : my_string.split("")) {
            list.add(item);
        }
        
        for (int i = 0; i < list.size(); i++) {
            int cnt = 0;
            while (cnt < n) {
                sb.append(list.get(i));
                cnt++;
            }
        }
        
        return sb.toString();
    }
}