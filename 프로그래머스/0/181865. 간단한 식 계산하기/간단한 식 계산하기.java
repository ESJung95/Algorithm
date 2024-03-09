import java.util.*;
class Solution {
    public int solution(String binomial) {
        
        int a = -1;
        int b = -1;
        String[] s = new String[3];
        int index = 0;
        for (String item : binomial.split(" ")) {
            s[index] = item;
            index++;
        }
        
        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[2]);
        int result = 0;
        
        if (s[1].equals("+")) {
            result = a + b;
        } else if (s[1].equals("-")) {
            result = a - b; 
        } else {
            result = a * b;
        }
        
        return result;
    }
}