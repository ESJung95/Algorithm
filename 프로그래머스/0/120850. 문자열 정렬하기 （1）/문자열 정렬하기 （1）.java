import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");
        System.out.print(my_string);
        
        int[] result = new int[my_string.length()];
        int index = 0;
        for (String item : my_string.split("")) {
            result[index] = Integer.parseInt(item);
            index++;
        }
        
        Arrays.sort(result);
        return result;
    }
}