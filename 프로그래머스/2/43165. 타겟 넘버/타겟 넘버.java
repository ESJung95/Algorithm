class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, target, 0, 0, answer);
        return answer;
    }

    private int dfs(int[] numbers, int target, int index, int sum, int answer) {
        if (index == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return answer;
        }

        answer = dfs(numbers, target, index + 1, sum + numbers[index], answer);
        answer = dfs(numbers, target, index + 1, sum - numbers[index], answer);
        return answer;
    }
}