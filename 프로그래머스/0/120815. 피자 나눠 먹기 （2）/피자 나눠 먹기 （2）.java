class Solution {
    public int solution(int n) {
        
        int result = 0;
        for (int i = 6; i <= (6 * n); i+=6) {
            if (i % n == 0) {
                result = (i / 6);
                break;
            }
        }
        
        return result;
    }
}