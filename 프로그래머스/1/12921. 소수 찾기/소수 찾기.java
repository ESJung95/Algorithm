class Solution {
    public int solution(int n) {

        boolean[] isPrime = new boolean[n + 1];
        
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j <= n; j +=i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int result = 0;
		//소수 개수 구하기
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                result++;
        }
    }
        return result;
    
    }
}
