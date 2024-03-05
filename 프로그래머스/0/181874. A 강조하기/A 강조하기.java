import java.util.*;
class Solution {
    public String solution(String myString) {
        
        char[] arr = myString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 65 && arr[i] <= 90) {
                arr[i] = Character.toLowerCase(arr[i]);
            } else if (arr[i] == 'a') {
                arr[i] = 'A';
            }
        }
        String result = new String(arr);
        return result;
    }
}