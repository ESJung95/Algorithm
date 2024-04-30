import java.util.*;

class Solution {
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public int[] solution(int n) {
        List<Integer> primes = new ArrayList<>();
        
        // 주어진 수 n을 소인수 분해하여 소수들을 primes 리스트에 추가
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && n % i == 0) {
                primes.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        // primes 리스트를 배열로 변환하여 반환
        int[] result = new int[primes.size()];
        for (int i = 0; i < primes.size(); i++) {
            result[i] = primes.get(i);
        }

        return result;
    }
}
