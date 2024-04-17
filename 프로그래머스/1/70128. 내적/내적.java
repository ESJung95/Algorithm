class Solution {
    public int solution(int[] a, int[] b) {
        
        int sum = 0;
        int length = a.length;
        for (int i = 0; i < length; i++) {
            sum += (a[i] * b[i]);
        }
        
        return sum;
    }
}