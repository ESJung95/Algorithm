import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        
        // 1 2 2 3 3 4 5 5 -> 6개 판매 , 서로 다른 종류가 최소가 되도록!
        // 22 33 55 종류의 개수 return 3
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < tangerine.length; i++) {
            if (map.size() == 0) {
                map.put(tangerine[i], 1);
            } else {
                if (!map.containsKey(tangerine[i])) {
                    map.put(tangerine[i], 1);
                } else {
                    map.put(tangerine[i], map.get(tangerine[i]) + 1);
                }
            }
        }
        
        List<Integer> countList = new ArrayList<>(map.values());
        Collections.sort(countList, Collections.reverseOrder());

        int cnt = 0;
        for (int count : countList) {
            k -= count;
            cnt++;
            if (k <= 0) {
                break;
            }
        }

        return cnt;
    }
}