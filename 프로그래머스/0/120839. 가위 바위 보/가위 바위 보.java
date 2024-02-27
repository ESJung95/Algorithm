import java.util.*;
class Solution {
    public String solution(String rsp) {
        // 가위2 바위0 보5
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[rsp.length()];
        int index = 0;
        for (String item : rsp.split("")) {
            arr[index] = item;
            index++;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("0")) {
                sb.append("5");
            } else if (arr[i].equals("2")) {
                sb.append("0");
            } else {
                sb.append("2");
            }
        }
        
        return sb.toString();
        
    }
}