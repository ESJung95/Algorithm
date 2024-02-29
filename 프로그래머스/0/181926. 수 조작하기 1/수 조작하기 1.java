import java.util.*;
class Solution {
    public int solution(int n, String control) {
        
        String[] arr = new String[control.length()];
        int index = 0;
        for (String item : control.split("")) {
            arr[index] = item;
            index++;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("w")) {
                n += 1;
            } else if (arr[i].equals("s")) {
                n -= 1;
            } else if (arr[i].equals("d")) {
                n += 10; 
            } else {
                n -= 10;
            }
        }
        
        return n;
    }
}