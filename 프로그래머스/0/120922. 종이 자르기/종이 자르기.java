class Solution {
    public int solution(int M, int N) {
        
        int result = 0;
        if (M == 1 && N == 1) {
            return result;
        } else {
            int temp = M - 1;
            result  += temp;
            result += (N - 1) * M;
        }
        
        return result;
    }
}