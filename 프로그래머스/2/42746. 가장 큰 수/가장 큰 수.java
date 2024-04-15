import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strNumbers = new String[numbers.length];
    
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }
      
        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));
       
        if (strNumbers[0].equals("0")) {
            return "0";
        }
    
        StringBuilder answer = new StringBuilder();
        for (String number : strNumbers) {
            answer.append(number);
        }
        
        return answer.toString();
    }
}