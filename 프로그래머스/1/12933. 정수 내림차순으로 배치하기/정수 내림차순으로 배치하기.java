import java.util.*;
class Solution {
    public long solution(long n) {
        
        String str = String.valueOf(n);
        String[] arr = new String[str.length()];
        int index = 0;
        for (String item : str.split("")) {
            arr[index] = item;
            index++;
        }
        
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        
        return Long.parseLong(sb.reverse().toString());
    }
}