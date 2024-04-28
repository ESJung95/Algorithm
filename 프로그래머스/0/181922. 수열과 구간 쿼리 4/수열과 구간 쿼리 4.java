class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        // 문제 이해를 못함 -> i는 index..
        // query -> s, e, k
        // s ~ e사이의 수 && k의 배수 = arr[i] + 1
        
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) { // 수정된 부분: j로 변경
                if (j % queries[i][2] == 0) {
                    arr[j] += 1;
                }
            }
        }
        
        return arr;
    }
}
