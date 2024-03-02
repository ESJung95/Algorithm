import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        
        int[] result = new int[sum];
        int index = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt = 0;
            while (cnt < arr[i]) {
                result[index] = arr[i];
                index++;
                cnt++;
            }
        }
        
        return result;
    }
}