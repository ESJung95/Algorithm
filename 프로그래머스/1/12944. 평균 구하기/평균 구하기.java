class Solution {
    public double solution(int[] arr) {
        
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        
        double result = (double)sum / arr.length;
        return result;
    }
}