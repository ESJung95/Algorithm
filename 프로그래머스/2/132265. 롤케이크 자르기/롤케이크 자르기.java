import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] topping) {
        int result = 0;
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        // map2에 모든 토핑의 종류와 개수를 담습니다.
        for (int item : topping) {
            map2.put(item, map2.getOrDefault(item, 0) + 1);
        }

        for (int item : topping) {
            // map1에 해당 토핑 추가
            map1.put(item, map1.getOrDefault(item, 0) + 1);

            // map2에서 해당 토핑 개수 감소
            map2.put(item, map2.get(item) - 1);
            if (map2.get(item) == 0) {
                map2.remove(item);
            }

            // 두 Map의 크기가 같다면 공평하게 자른 것
            if (map1.size() == map2.size()) {
                result++;
            }
        }

        return result;
    }
}