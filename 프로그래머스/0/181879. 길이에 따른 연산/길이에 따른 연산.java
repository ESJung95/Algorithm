class Solution {
    public int solution(int[] num_list) {
        
        int result = 0;
        if (num_list.length >= 11) {
            int sum = 0;
            for (int item : num_list) {
                sum += item;
            }
            result = sum;
        } else {
            int multi = 1;
            for (int item : num_list) {
                multi *= item;
            }
            result = multi;
        }
        
        return result;
    }
}