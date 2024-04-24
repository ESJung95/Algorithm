class Solution {
	public int solution(int n, int m, int[] section) {
        int result = 0;
        int start = section[0];

        result++;
        for (int item : section) {
            if (start + m > item) {
                continue;
            }
            start = item;
            result++;
        }
        return result;
    }
}