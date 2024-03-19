import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        
        for (int i = 0; i < numbers.length; i++) {
            if (list.contains(numbers[i])) {
                list.remove(Integer.valueOf(numbers[i]));
            }
        }
        
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        
        return sum;
    }
}