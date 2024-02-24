import java.util.*;
class Solution {
    public int solution(int n, int t) {
        // 1시간에 2배
        double result = n * Math.pow(2,t);
        return (int)result;
    }
}