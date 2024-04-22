import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        
        int[] result = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        
        if (k > score.length) {
            for (int i = 0; i < score.length; i++) {
                list.add(score[i]);
                Collections.sort(list);
                result[i] = list.get(0);
            }
            return result;
        }
        
        
        for (int i = 0; i < k; i++) {
            list.add(score[i]);
            Collections.sort(list);
            result[i] = list.get(0);
        }
        // System.out.println(list);
        
        for (int i = k; i < score.length; i++) {
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder());
            result[i] = list.get(k-1);
        }
        
        return result;
    }
}