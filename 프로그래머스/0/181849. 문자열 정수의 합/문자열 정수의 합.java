class Solution {
    public int solution(String num_str) {
        
        char[] num = num_str.toCharArray();
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += Integer.parseInt(String.valueOf(num[i]));
        }
        
        return sum;
    }
}