import java.util.*;
class Solution {
    public int solution(String myString, String pat) {
        
        char[] arr = myString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A') {
                arr[i] = 'B';
            } else {
                arr[i] = 'A';
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (char item : arr) {
            sb.append(String.valueOf(item));
        }
        
        int result = 0;
        if (sb.toString().contains(pat)) {
            result = 1;
        }
        
        return result;
    }
}