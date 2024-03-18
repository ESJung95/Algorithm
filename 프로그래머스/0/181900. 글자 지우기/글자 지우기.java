import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int i = 0; i < indices.length; i++) {
            sb.replace(indices[i], indices[i] + 1, " ");
        }
        
        String temp = sb.toString();
        sb.setLength(0);
        for (String item : temp.split("")) {
            if (!item.equals(" ")) {
                sb.append(item);
            }
        }
        
        return sb.toString();
    }
}