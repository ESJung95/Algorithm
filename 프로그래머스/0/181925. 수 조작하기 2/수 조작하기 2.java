import java.util.*;
class Solution {
    public String solution(int[] numLog) {
        
        char[] resultArr = new char[numLog.length - 1];
        for (int i = 0; i < numLog.length - 1; i++) {
            if (numLog[i+1] - numLog[i] == 1) {
                resultArr[i] = 'w';
            } else if (numLog[i+1] - numLog[i] == -1) {
                resultArr[i] = 's';
            } else if (numLog[i+1] - numLog[i] == 10) {
                resultArr[i] = 'd';
            } else {
                resultArr[i] = 'a';
            }
        }
        
        String result = new String(resultArr);
        return result;
    }
}