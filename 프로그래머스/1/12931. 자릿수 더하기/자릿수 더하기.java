import java.util.*;

public class Solution {
    public int solution(int n) {
        
        String str = String.valueOf(n);
        ArrayList<Integer> list = new ArrayList<>();
        for (String item : str.split("")) {
            list.add(Integer.parseInt(item));
        }
        
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        
        return sum;
    }
}