import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        
        String[] empty = {"EMPTY"};
        myStr = myStr.replace("a"," ");
        myStr = myStr.replace("b"," ");
        myStr = myStr.replace("c"," ");
        
        ArrayList<String> list = new ArrayList<>();
        for (String item : myStr.split(" ")) {
            if (!item.equals("")) {
                list.add(item);
            }
        }
        // System.out.println(list);
        String[] result = new String[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        
        if (result.length == 0) {
            return empty;
        }
        
        return result;
    }
}