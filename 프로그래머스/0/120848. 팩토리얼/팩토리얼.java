class Solution {
    public int solution(int n) {
        
        int result = 0;
        int temp = 1;
        for (int i = 2; i <= 10; i++){
            temp = temp * i;
            if (temp == n) {
                result = i;
                break;
            } else if (temp > n) {
                result = (i-1);
                break;
            }
        }
        
        return result;
    }
}