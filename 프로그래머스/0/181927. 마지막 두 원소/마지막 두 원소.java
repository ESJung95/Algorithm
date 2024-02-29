import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        
        int last = num_list[num_list.length - 1];
        int beforeLast = num_list[num_list.length - 2];
        
        int[] result = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++) {
            result[i] = num_list[i];
        }
        
        if (last > beforeLast) {
            result[result.length - 1] = (last - beforeLast);
        } else {
            result[result.length - 1] = 2 * last ;
        }
        
        return result;
    }
}