import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        // 100 - progresses -> 남은 일의 양 / speeds = 값을 올림하기
        // 올림한 값을 배열에 담고 맨 앞부터 이하인 개수 cnt 
        
        int[] workRemain = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            workRemain[i] = 100 - progresses[i];
        }
        
        int[] workingTime = new int[speeds.length];
        for (int i = 0; i < speeds.length; i++) {
            workingTime[i] = (int)Math.ceil((double)workRemain[i] / speeds[i]);
        }
        
        List<Integer> list = new ArrayList<>();
        int cnt = 1;
        int maxTime = workingTime[0];
        
        for (int i = 1; i < workingTime.length; i++) {
            if (maxTime >= workingTime[i]) {
                cnt++;
            } else {
                list.add(cnt);
                cnt = 1;
                maxTime = workingTime[i];
            }
        }
        list.add(cnt);
        
        int index = 0;
        int[] result = new int[list.size()];
        for (int item : list) {
            result[index] = item;
            index++;
        }
        
        return result;
    }
}