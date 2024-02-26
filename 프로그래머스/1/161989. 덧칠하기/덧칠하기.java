class Solution {
    public int solution(int n, int m, int[] section) {
        
        // start 값을 section[0]
        int start = section[0];
        int end = section[0] + m - 1;
        int result = 1;
        
        for (int item : section) {
            if (item >= start && item <= end) {
                continue;
            } else {
                start = item;
                end = item + m - 1;
                result++;
            }
        }
        
        return result;
    }
}