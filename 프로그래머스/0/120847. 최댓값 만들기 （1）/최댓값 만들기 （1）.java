import java.util.Arrays;

class Solution {
  public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int firstMaxValue = numbers[numbers.length - 1];
        int secondMaxValue = numbers[numbers.length - 2];

        return firstMaxValue * secondMaxValue;
    }
}