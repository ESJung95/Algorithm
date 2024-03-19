import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if (arr.length == 1) {
            list.add(-1);
        } else {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != min) {
                    list.add(arr[i]);
                }
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}