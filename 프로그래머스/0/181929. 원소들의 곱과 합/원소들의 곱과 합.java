import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        
        int sum = num_list[0];
        for (int i = 1; i < num_list.length; i++) {
            sum += num_list[i];
        }
        
        int multi = num_list[0];
        for (int i = 1; i < num_list.length; i++) {
            multi *= num_list[i];
        }
        
        int result = 1;
        if (multi > Math.pow(sum,2)) {
            result = 0;
        }
        
        return result;
    }
}