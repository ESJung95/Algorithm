import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        
        int[] result = new int[2];
        int max = array[0];
        int index = 0;
        
        if (array.length == 1) {
            result[0] = array[0];
            result[1] = 0;
        } else {
            for (int i = 1; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                    index = i;
                }
            }
        }
        result[0] = max;
        result[1] = index;
        return result;
    }
}