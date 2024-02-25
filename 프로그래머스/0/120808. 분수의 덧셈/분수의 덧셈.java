import java.util.*;
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int[] result = new int[2];
        if (denom1 == denom2) {
            result[0] = numer1 + numer2;
            result[1] = denom1;
        } else {
            result[0] = (numer1 * denom2) + (numer2 * denom1);
            result[1] = denom1 * denom2;
        }
        
        int min = result[0] > result[1] ? result[1] : result[0];
        int gcd = 0;
        for (int i = 1; i <= min; i++) {
            if (result[0] % i == 0 && result[1] % i == 0) {
                gcd = i;
            }
        }
        
        if (gcd != 1) {
            result[0] = result[0] / gcd;
            result[1] = result[1] / gcd;
        } 
        
        
        return result;
    }
}