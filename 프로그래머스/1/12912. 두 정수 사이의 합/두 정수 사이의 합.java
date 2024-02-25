import java.util.*;
class Solution {
    public long solution(int a, int b) {
        
        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        
        Arrays.sort(arr);
        long result = 0;
        for (int i = arr[0]; i <= arr[1]; i++) {
            result += (long)i;
        }
        
        return result;

    }
}