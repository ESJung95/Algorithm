import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        ArrayList<String> temp  = new ArrayList<>();
        for (String item : my_string.split(" ")) {
            temp.add(item);
        }
        
        String[] result = new String[temp.size()];
        int index = 0;
        for (String item : temp) {
            result[index] = item;
            index++;
        }
        
        return result;
    }
}