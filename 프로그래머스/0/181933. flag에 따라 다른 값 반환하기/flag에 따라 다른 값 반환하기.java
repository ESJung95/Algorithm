class Solution {
    public int solution(int a, int b, boolean flag) {
        int result = 0;
        if (flag) {
            result = a + b;
        } else {
            result = a - b;
        }
        
        return result;
    }
}