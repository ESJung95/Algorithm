class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
            for(int i = 0; i < queries.length; i++){
                int temp1 = queries[i][0]; // 0
                int temp2 = queries[i][1]; // 3
                int temp3 = arr[temp1];
                arr[temp1] = arr[temp2];
                arr[temp2] = temp3;
            }
        
        return arr;
    }
}