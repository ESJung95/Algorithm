class Solution {
    public int solution(int n) {
        
        int result = 2;
        if (Math.sqrt(n) % 1 == 0) {
            result = 1;
        }
        
        return result;
    }
}