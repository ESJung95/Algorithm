import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(n);
        
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                temp.add(n);
            } else {
                n = 3 * n + 1;
                temp.add(n);
            }
        }
        
        int[] result = new int[temp.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp.get(i);
        }
        
        return result;
    }
}