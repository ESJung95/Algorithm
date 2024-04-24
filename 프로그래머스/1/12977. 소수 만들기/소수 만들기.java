import java.util.*;

public class Solution {
    
    public static int[][] combinations(int[] nums, int r) {
        List<int[]> result = new ArrayList<>();
        
        for(int i = 0; i < nums.length - 2; i++) {
            for (int j = i+1; j < nums.length - 1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int[] combination = new int[3];
                    combination[0] = nums[i];
                    combination[1] = nums[j];
                    combination[2] = nums[k];
                    result.add(combination);
                }
            }
        }
        
        return result.toArray(new int[0][]);
    }
    
    public int solution(int[] nums) {
        int[][] combos = combinations(nums, 3);
        int primeCount = 0;
        
        for (int[] combo : combos) {
            int sum = combo[0] + combo[1] + combo[2];
            if (isPrime(sum)) {
                primeCount++;
            }
        }
        
        return primeCount;
    }
    
    // 소수 판별 함수
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
