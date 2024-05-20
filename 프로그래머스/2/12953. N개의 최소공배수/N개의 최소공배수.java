class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcm = findLCM(lcm, arr[i]);
        }
        return lcm;
    }

    // 두 수의 최소 공배수를 찾는 메서드
    public static int findLCM(int num1, int num2) {
        return num1 * (num2 / findGCD(num1, num2));
    }
    
    // 최대 공약수를 찾는 메서드
    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
