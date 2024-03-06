import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> list = new ArrayList<>();
        int[] day = new int[progresses.length];
        
      
        for(int i = 0; i < speeds.length; i++){
            day[i]  = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0){
                day[i]++;
            }
        }
        
        int days = day[0];
        int cnt = 1;
        for(int i = 1; i < progresses.length; i++){
            
            if (days >= day[i]) {
                cnt++;
            } else {
                list.add(cnt);
                cnt = 1;
                days = day[i];
            }
        }
        
        list.add(cnt);
        
        int[] result = new int[list.size()];

        for (int i = 0; i <list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}