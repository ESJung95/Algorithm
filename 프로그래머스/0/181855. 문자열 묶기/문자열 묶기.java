import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < strArr.length; i++) {
            if (!map.containsKey(strArr[i].length())) {
                map.put(strArr[i].length(), 1);
            } else {
                map.put(strArr[i].length(), map.get(strArr[i].length())+1);
            }
        }
        
        // System.out.println(map);
        int result = Collections.max(map.values());
        
        return result;
    }
}