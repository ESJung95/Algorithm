import java.util.*;
class Solution {
    public int solution(int num, int k) {
        
        String str = String.valueOf(num);
        ArrayList<Integer> list = new ArrayList<>();
        for (String item : str.split("")) {
            list.add(Integer.parseInt(item));
        }
        
        int result = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == k) {
                result = i+1;
                break;
            }
        }
        return result;
    }
}