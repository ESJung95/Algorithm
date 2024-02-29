import java.util.*;
class Solution {
    public String solution(String cipher, int code) {
        
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[cipher.length()];
        int index = 0;
        
        for (String item : cipher.split("")) {
            arr[index] = item;
            index++;
        }
        
        for (int i = (code - 1); i < arr.length; i+=code) {
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}