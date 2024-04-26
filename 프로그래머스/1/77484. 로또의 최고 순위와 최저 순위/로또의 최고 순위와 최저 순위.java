import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(6, 1); // 맞은 개수 , 등수
        map.put(5, 2);
        map.put(4, 3);
        map.put(3, 4);
        map.put(2, 5);
        map.put(1, 6);
        map.put(0, 6);
        
        int matchCnt = 0;
        int zeroCnt = 0;
        int[] result = new int[2]; // 최고순위 , 최저순위 return
        Arrays.sort(lottos); 
        Arrays.sort(win_nums); 
        
        if (Arrays.equals(lottos, win_nums)) {
            result[0] = 1;
            result[1] = 1;
            return result;
        } 
        
    
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == 0) {
                    zeroCnt++;
                    break;
                } else {
                    if (lottos[i] == win_nums[j]) {
                        matchCnt++;
                        break;
                    }
                }
            }
        }
        
        System.out.println(zeroCnt);
        // System.out.println(matchCnt);
        result[1] = map.get(matchCnt);
        
        switch (zeroCnt) {
            case 0:
                if (zeroCnt == 0) {
                    result[0] = map.get(matchCnt);
                }
                break;
                
            case 1:
                if (zeroCnt == 1) {
                    result[0] = map.get(matchCnt+1);
                }
                break;
            
            case 2:
                if (zeroCnt == 2) {
                    result[0] = map.get(matchCnt+2);
                }
                break;
                
            case 3:
                if (zeroCnt == 3) {
                    result[0] = map.get(matchCnt+3);
                }
                break;
                
            case 4:
                if (zeroCnt == 4) {
                    result[0] = map.get(matchCnt+4);
                }
                break;
                
            case 5:
                if (zeroCnt == 5) {
                    result[0] = map.get(matchCnt+5);
                }
                break;
                
            case 6:
                if (zeroCnt == 6) {
                    result[0] = map.get(matchCnt+6);
                }
                break;
        }
        
        return result;
    }
}
