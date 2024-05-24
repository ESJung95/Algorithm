import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            if (map.size() == 0) {
                map.put(clothes[i][1], 1);
            } else {
                if (!map.containsKey(clothes[i][1])) {
                    map.put(clothes[i][1], 1);
                } else {
                    map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
                }
            }
        }
        
        System.out.println(map);
        if (map.size() == 1) {
            return clothes.length;
        }
        
        int result = 1;
        for (int value : map.values()) {
            result *= (value + 1);
        }
        
        return result - 1;
    }
}