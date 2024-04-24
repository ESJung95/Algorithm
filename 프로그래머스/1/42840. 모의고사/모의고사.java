import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        // 1번 수포자 : 12345 반복 5
        // 2번 수포자 : 21232425 반복 8
        // 3번 수포자 : 3311224455 반복 10
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == arr1[i% arr1.length]) {
                cnt[0]++;
            }
            
            if(answers[i] == arr2[i% arr2.length]) {
                cnt[1]++;
            }
            
            if(answers[i] == arr3[i% arr3.length]) {
                cnt[2]++;
            }
        }
        
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < cnt.length; i++) {
            if (max < cnt[i]) {
                max = cnt[i];
            }
        }
        
        for (int i = 0; i < cnt.length; i++) {
            if(max == cnt[i]) {
                list.add(i+1);
            }
        }
        
        
        
        // System.out.println(list);
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}