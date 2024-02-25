import java.util.*;
class Solution {
    public int solution(int[] sides) {
        
        int result = 2;
        Arrays.sort(sides);
        if (sides[0] + sides[1] > sides[2]) {
            result = 1;
        }
        
        return result;
    }
}