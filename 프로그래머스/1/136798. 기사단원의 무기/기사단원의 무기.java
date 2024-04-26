import java.util.*;

class Solution {
    private int calculate(int number, int limit, int power) {
        int[] divisorCount = new int[number + 1]; // 각 숫자의 약수 개수를 저장할 배열
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisorCount[j]++; // 숫자 j의 약수 개수 증가
            }
        }

        for (int i = 1; i <= number; i++) {
            if (divisorCount[i] > limit) {
                sum += power; // limit을 초과하는 경우 power만큼 더함
            } else {
                sum += divisorCount[i]; // limit을 초과하지 않는 경우 약수 개수만큼 더함
            }
        }

        return sum;
    }

    public int solution(int number, int limit, int power) {
        // 1 ~ number 기사 번호
        // 기사 번호의 약수의 개수 = 공격력 / 제한 수치 이상이면 정한 공격력 무기 구매
        // 공격력 1당 1kg의 철이 필요 -> 필요한 철의 무게 return
        return calculate(number, limit, power);
    }
}
