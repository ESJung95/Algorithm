import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] result = new int[num_list.length];
        int index = 0;
        for (int i = n; i < num_list.length; i++) {
            result[index] = num_list[i];
            index++;
        }
        
        for (int i = 0; i < n; i++) {
            result[index] = num_list[i];
            index++;
        }
        
        return result;
    }
}