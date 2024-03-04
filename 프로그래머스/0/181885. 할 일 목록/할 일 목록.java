import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                temp.add(todo_list[i]);
            }
        }
        
        String[] result = new String[temp.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp.get(i);
        }
        
        return result;
    }
}