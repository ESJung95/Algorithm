class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;
        int left = 0, right = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        int[] result = new int[2];

        while (right < n) {
            // 오른쪽 포인터를 이동시키며 합 계산
            sum += sequence[right];

            // 합이 k보다 크거나 같으면 왼쪽 포인터를 조정
            while (sum >= k) {
                int len = right - left + 1;
                if (sum == k && len < minLen) {
                    minLen = len;
                    result[0] = left;
                    result[1] = right;
                } else if (sum == k && len == minLen) {
                    // 시작 인덱스가 작은 경우 선택
                    if (left < result[0]) {
                        result[0] = left;
                        result[1] = right;
                    }
                }
                sum -= sequence[left];
                left++;
            }

            right++;
        }

        return result;
    }
}