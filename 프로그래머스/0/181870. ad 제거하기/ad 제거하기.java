import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        String ad = "ad";
        ArrayList<String> temp = new ArrayList<>();
        
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains(ad)) {
                temp.add(strArr[i]);
            }
        }
        
        String[] result = new String[temp.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp.get(i);
        }
        
        return result;
    }
}