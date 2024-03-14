import java.util.*;
class Solution {
    public int solution(String number) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for (String item : number.split("")) {
            list.add(Integer.parseInt(item));
        }
        
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        
        int result = sum % 9;
        
        return result;
    }
}