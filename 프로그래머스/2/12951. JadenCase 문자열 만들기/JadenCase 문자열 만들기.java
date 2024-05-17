import java.util.*;
class Solution {
    public String solution(String s) {
        
        // 모든 단어의 첫 문자 = 대문자 +  그 외 = 소문자 
        // 첫 문자가 알파벳이 아닌 경우 -> 그냥 작성 + 소문자
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(" ");
            } else {
                break;
            }
        }
        
        String front = sb.toString();
        sb.setLength(0);
        
        for (int j = s.length() - 1; j >= 0; j--) {
            if (s.charAt(j) == ' ') {
                sb.append(" ");
            } else {
                break;
            }
        }
        String back = sb.toString();
        sb.setLength(0);
        
        s = s.trim(); // 맨 앞이 공백일 경우!!!!
        
        char[] arr = s.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == ' ' && arr[i+1] != ' ') {
                arr[i+1] = Character.toUpperCase(arr[i+1]);
                i++;
            } else {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        
        String center = new String(arr);
        sb.append(front);
        sb.append(center);
        sb.append(back);
        
        return sb.toString();
    }
}