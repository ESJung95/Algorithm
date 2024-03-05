class Solution {
    public int solution(int[] num_list) {
        
        int sum1 = num_list[0]; // 홀수 합
        int sum2 = 0;
        for (int i = 1; i < num_list.length; i++) {
            if (i % 2 != 0) { // i홀수가 짝수합으로
                sum2 += num_list[i];
            } else {
                sum1 += num_list[i];
            }
        }
        
        int result = sum2;
        if (sum1 > sum2) {
            result = sum1;
        } 
        
        return result;
    }
}