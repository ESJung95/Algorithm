import java.util.*;
class Solution {
    public String solution(int[] food) {
     
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i < food.length; i++) {
            list.add(food[i] / 2); 
        }
        
        // System.out.println(list);
        int cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            cnt = 0;
            while (list.get(i) > cnt) {
                sb.append(String.valueOf(i+1));
                cnt++;
            }
        }
        
        String front = sb.toString();
        String back = sb.reverse().toString();
        sb.setLength(0);
        
        sb.append(front);
        sb.append("0");
        sb.append(back);
        
        return sb.toString();
    }
}