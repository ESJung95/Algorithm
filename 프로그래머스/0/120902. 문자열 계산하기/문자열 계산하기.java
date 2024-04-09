import java.util.*;
class Solution {
    public int solution(String my_string) {
        // 공백으로 분류해야겠다
        ArrayList<String> list = new ArrayList<>();
        for (String item : my_string.split(" ")) {
            list.add(item);
        }
        // System.out.println(list);
        
        int result = Integer.parseInt(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals("+")) {
                result = result + Integer.parseInt(list.get(i+1));
            } else if (list.get(i).equals("-")) {
                result = result - Integer.parseInt(list.get(i+1));
            } 
        }
        return result;
    }
}