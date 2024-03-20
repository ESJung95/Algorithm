class Solution {
    public int solution(int[] array, int n) {
        
        int min = 100;
        int result = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - n) < min) {
                min = (int)Math.abs(array[i] - n);
                result = array[i];
            } else if (min == Math.abs(array[i] - n) && result > array[i]) {
                result = array[i];
            }
        }
        
        return result;
    }
}