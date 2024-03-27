import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
     
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            String temp = intStrs[i].substring(s, s+l);
            if (Integer.parseInt(temp) > k) {
                list.add(Integer.parseInt(temp));
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}