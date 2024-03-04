import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        
        double length = Math.ceil((double)names.length / 5);
        
        String[] result = new String[(int)length];
        int index = 0;
        for (int i = 0; i < names.length; i+=5) {
            result[index] = names[i];
            index++;
        }
        
        return result;
    }
}