import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        my_string = my_string.trim();
        ArrayList<String> temp = new ArrayList<>();
        for (String item : my_string.split(" ")) {
            if(!item.equals("")) {
                temp.add(item);
            }
        }
        
        String[] result = new String[temp.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp.get(i);
        }
        
        return result;
    }
}