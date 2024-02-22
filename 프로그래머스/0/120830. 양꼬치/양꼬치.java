class Solution {
    public int solution(int n, int k) {
        
        // 10인분 = 음료수 1개 서비스
        int service = n / 10 ;
        int result = (n * 12000) + ((k - service) * 2000);
        return result;
    }
}