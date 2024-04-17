class Solution {
    
    static long calculate (int price, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += (price*i);
        }
        
        return sum;
    }
    
    public long solution(int price, int money, int count) {
        long sum = calculate(price, count);
        long result = 0;
        
        if (sum > money) {
            result = (sum - money);
        }
        
        return result;
    }
}