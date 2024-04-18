import java.util.*;
class Solution {
    // 유클리드 호제법
    public static int findGCD (int n, int m) { // 최대 공약수

        // 비교할 두 수
        int maxNum = n > m ? n : m;
        // 나머지가 0이 될 때 까지 반복
        while(m != 0) {
            int temp = n % m;
            n = m;
            m = temp;
        }
        
        return n;
        
        
    }
    
        
    public int[] solution(int n, int m) {
        
        int[] result = new int[2]; // 최대공약수, 최소공배수
        int gcd = findGCD(n,m);
        int lcm = (n*m) / gcd;
        
        result[0] = gcd;
        result[1] = lcm;
        
        return result;
        
    }
}