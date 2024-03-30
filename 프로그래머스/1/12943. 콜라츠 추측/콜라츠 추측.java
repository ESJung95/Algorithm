class Solution {
    public int solution(int num) {
        
        Long num2 = new Long(num);
        int result = 0;
        if (num2 == 1) {
            result = 0;
        } else {
            while(num2 > 1 && result < 500) {
                if (num2 % 2 == 0) {
                    num2 /= 2;
                    result++;
                } else {
                    num2 = (num2*3)+1;
                    result++;
                }
            }
        }
        if (result == 500) {
            result = -1;
        }
        return result;
    }
}