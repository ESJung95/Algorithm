import java.util.*;
class Solution {
    public int solution(int n) {
        
        String nn = String.valueOf(n);
        ArrayList<Integer> list = new ArrayList<>();
        for (String item : nn.split("")) {
            list.add(Integer.parseInt(item));
        }
        
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        
        return result;
    }
}