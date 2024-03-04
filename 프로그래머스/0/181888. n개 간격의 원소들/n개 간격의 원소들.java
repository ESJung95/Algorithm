import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int length = 0;
        if (num_list.length % n == 0) {
            length = num_list.length / n;
        } else {
            length = (num_list.length / n) + 1;
        }
        int[] result = new int[length];
        
        int index = 0;
        for (int i = 0; i < num_list.length; i+=n) {
            result[index] = num_list[i];
            index++;
        }
        
        return result;
    }
}