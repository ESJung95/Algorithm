class Solution {
    public String solution(int num) {
        
        String result = "Odd";
        if (num == 0 || num % 2 == 0) {
            result = "Even";
        }
        
        return result;
    }
}