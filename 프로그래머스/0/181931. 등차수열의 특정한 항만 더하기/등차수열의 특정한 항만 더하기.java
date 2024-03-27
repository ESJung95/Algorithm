import java.util.*;
class Solution {
    public int solution(int a, int d, boolean[] included) {
        // a 첫째항 , d 공차인 등차수열에서 included[i]가 i+1 항을 의미할 때
        // 등차수열의 1항부터 n항까지 true인 항들만 더한 값을 return
        
        int[] arr = new int[included.length];
        arr[0] = a;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + d;
        }
        
        // System.out.println(Arrays.toString(arr));
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (included[i]) {
                result += arr[i];
            }
        }
        
        return result;
    }
}