import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        // 1점부터 k점까지 점수로 분류
        // 상자에 m개씩 담아 포장 -> 가장 낮은 점수 * m =  상자 가격
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int item : score) {
            list.add(item);
        }
        Collections.sort(list, Collections.reverseOrder());
        
        // System.out.println(list);
        for(int i = (m-1); i < list.size(); i+=m) {
            result += list.get(i) * m;
        // System.out.println(result);
        }
        
        return result;
        
    }
}