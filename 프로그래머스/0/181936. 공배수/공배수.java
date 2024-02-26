class Solution {
    public int solution(int number, int n, int m) {
        
        int result = 0;
        if (number % n == 0 && number % m == 0) {
            result = 1;
        }
        
        return result;
    }
}