class Solution {
    
    // 약수 구하는 메소드 
    static int calculate (int num) {
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if(num % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
    public int solution(int left, int right) {
        
        // left - right -> 약수의 개수가 짝수 + / 약수의 개수가 홀수 -
        int result = 0;
        for (int i = left; i <= right; i++) {
            if (calculate(i) % 2 == 0) {
                result += i;
            } else {
                result -= i;
            }
        }
        return result;
        
    }
}