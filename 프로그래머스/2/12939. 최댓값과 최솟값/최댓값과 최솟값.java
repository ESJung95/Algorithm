import java.util.*;
class Solution {
    public String solution(String s) {
        
        StringBuilder result = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (String item : s.split(" ")) {
            list.add(Integer.parseInt(item));
        }
        
        Collections.sort(list);
        // System.out.println(list);
        result.append(String.valueOf(list.get(0)));
        result.append(" ");
        result.append(String.valueOf(list.get(list.size() -1)));
        
        return result.toString();
        
        
        
    }
}