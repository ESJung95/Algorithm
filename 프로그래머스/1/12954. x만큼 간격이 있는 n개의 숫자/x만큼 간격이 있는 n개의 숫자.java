class Solution {
    public long[] solution(int x, int n) {
        long[] result = new long[n];
        
        int cnt = 0;
        long sum = x;
        while(cnt < n) {
            result[cnt] = sum;
            sum += x;
            cnt++;
        }
        
        return result;
    }
}