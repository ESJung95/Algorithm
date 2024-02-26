class Solution {
    public int solution(int n) {
        
        int start = 1; int finish = 1;
        int result = 1;
        int sum = 0;
        while(true) {
            if (sum > n) {
                sum -= start++;
            } else if (finish == n) {
                break;
            } else {
                sum += finish++;
            }
            
            if (sum == n) {
                result++;
            }
        }
        
        return result;
    }
}