import java.util.*;

public class Solution {
    public int solution(int n) {
        // k칸 앞으로 점프, x2 순간이동
        // 점프하면 k만큼 건전지 사용
        // 점프하는 걸 최소로 거리 N까지 이동하기
        // 사용해야 하는 건전지 사용량의 최솟값을 return
        
        // 짝수면 *2 홀수면 +1
        int result = 0;
        
        while(n != 0) {
            if (n % 2 == 0) {
                n = (n / 2);
            } else {
                n = (n - 1);
                result++;
            }
        }
        
        return result;
    }
}