import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        
        int result = 0;
        Arrays.sort(numbers);
        int front = numbers[0] * numbers[1];
        int back = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        if (front > back) {
            result = front;
        } else {
            result = back;
        }
        
        return result;
        
        
    }
}