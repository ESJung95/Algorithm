import java.util.*;
class Solution {
    public String solution(String my_string) {
        
        ArrayList<Character> list = new ArrayList<>();
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        
        StringBuilder sb =  new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        
        return sb.toString();
    }
}