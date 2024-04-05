import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        
        long result = 0;
        long left = 0;
        long right = times[times.length-1] * (long)n; //모든 사람이 가장 느리게 심사받음
        
        Arrays.sort(times);
        while(left <= right) {
            long mid = (left + right) / 2;
            long complete = 0;
            
            for (int i = 0; i < times.length; i++)
                complete += mid / times[i];
            if (complete < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
                result = mid; 
            }
        }  
        return result;
    }
}