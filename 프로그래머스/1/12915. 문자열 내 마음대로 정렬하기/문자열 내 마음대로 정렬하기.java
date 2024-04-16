import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        String[] result = new String[strings.length];
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(list);
        
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i).substring(1);
        }
        
        return result;
    }
}