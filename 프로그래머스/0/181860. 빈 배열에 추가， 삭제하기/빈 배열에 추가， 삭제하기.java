import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        // true면 arr[i]를 arr[i] * 2번 추가
        // false면 마지막 arr[i]개의 원소를 제거하고 return
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                int cnt = 0;
                while (arr[i] * 2 > cnt) {
                    list.add(arr[i]);
                    cnt++;
                }
            } else {
                int cnt = 0;
                while (arr[i] > cnt) {
                    list.remove(list.size() - 1);
                    cnt++;
                }
            }
        }
        
        int[] result = new int[list.size()];
        int index = 0;
        for (int item : list) {
            result[index] = item;
            index++;
        }
        
        return result;
    }
}