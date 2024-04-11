import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        int result = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int a = i; a <= j; a++) {
            sb.append(String.valueOf(a));
        }
        // System.out.println(sb);
        String strK = String.valueOf(k);
        for (String item : sb.toString().split("")) {
            if (item.equals(strK)) {
                result++;
            }
        }
        return result;
    }
}