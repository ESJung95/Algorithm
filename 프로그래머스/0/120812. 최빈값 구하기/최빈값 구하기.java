import java.util.*;
class Solution {
    public int solution(int[] array) {
        
        if (array.length > 1) {
                    HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < array.length - 1; i++) {
            cnt = 0;
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    cnt++;
                    array[j] = -1;
                }
            }
            map.put(array[i], cnt);
        }

        Integer max = Collections.max(map.values());
        ArrayList<Integer> valueList = new ArrayList<>(map.values());
        int check = 0;
        for (int item : valueList) {
            if (item == max) {
                check++;
            }
        }

        int result = 0;
        if (check >= 2) {
            result = -1;
        } else {
            for (Integer key : map.keySet()) {
                if (map.get(key).equals(max)) {
                    result = key;
                }
            }
        }
        return result;
        }
        return array[0];
    }
}
