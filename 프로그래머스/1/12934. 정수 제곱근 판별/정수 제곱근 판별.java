class Solution {
    public long solution(long n) {
        
        long result = -1;
        
        if (Math.sqrt((double)n) % 1 == 0) {
            double temp = Math.sqrt(n);
            result = (long)Math.pow(temp+1, 2);
        }
        
        return result;
    }
}