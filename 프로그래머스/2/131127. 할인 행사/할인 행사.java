import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int result = 0;
        
        // map에 want - number 담아두고 discount돌면서 하나씩 지우기
        
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        // discount 배열을 10일씩 확인합니다.
        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> discountMap = new HashMap<>(wantMap);
            
            // 10일 동안의 할인 제품을 확인합니다.
            for (int j = i; j < i + 10; j++) {
                String product = discount[j];
                
                // 할인 제품이 원하는 제품 목록에 있으면 수량을 감소시킵니다.
                if (discountMap.containsKey(product)) {
                    int count = discountMap.get(product);
                    if (count == 1) {
                        discountMap.remove(product);
                    } else {
                        discountMap.put(product, count - 1);
                    }
                }
            }
            
            // 10일 동안 원하는 제품을 모두 할인 받을 수 있는지 확인합니다.
            if (discountMap.isEmpty()) {
                result++;
            }
        }
        
        return result;
    }
}