import java.util.*;
class Solution {
    public int solution(String A, String B) {
        
        String[] arr = new String[A.length()];
        int index = 0;
        for (String item : A.split("")) {
            arr[index] = item;
            index++;
        }
        
        StringBuilder sb = new StringBuilder();
        int result = -1;
        
        if (A.equals(B)) {
            return 0;
        }
        
        int cnt = 0;
        while(cnt <= arr.length - 1) {
            
            String temp = arr[arr.length - 1];
            sb.append(temp);
            
            for (int i = 0; i < arr.length - 1; i++) {
                sb.append(arr[i]);
            }
            
            cnt++;
            if (B.equals(sb.toString())) {
            result = cnt;
            break;
            }
            
            index = 0;
            for (String item : sb.toString().split("")) {
                arr[index] = item;
                index++;
            }
            
            sb.setLength(0);
        }
        return result;
    }
}