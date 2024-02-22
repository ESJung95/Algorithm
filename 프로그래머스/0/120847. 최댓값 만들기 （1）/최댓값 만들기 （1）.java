class Solution {
    public int solution(int[] numbers) {
        
        int max = 0;
        for (int i =  0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] != 0 && numbers[j] != 0) {
                    int num = numbers[i] * numbers[j];
                    if (max < num) {
                        max = num;
                    }
                }
            }
        }
        return max;
    }
}