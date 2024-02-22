import java.util.*;
class Solution {
    public int[] solution(int money) {
        
        int[] result = new int[2];
        int coffee = 5500;
        int num = money / coffee;
        int change = money - (coffee * num);
        
        result[0] = num;
        result[1] = change;
        
        return result;
    }
}