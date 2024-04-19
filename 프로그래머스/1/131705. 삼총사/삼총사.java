import java.util.*;
class Solution {
    public int solution(int[] number) {
        
        // 3명의 정수번호를 더했을 때 0 = 삼총사
        // 삼총사를 만들 수 있는 방법의 수 return
        
        // 조합 문제 -> nCr r=3 / n=number.length 거기서 뽑아서 더하기
        int n = number.length;
        int r = 3;
        int cnt = 0;
        
        for (int i = 0; i < n-2; i ++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        
        return cnt;
        
        
    }
}