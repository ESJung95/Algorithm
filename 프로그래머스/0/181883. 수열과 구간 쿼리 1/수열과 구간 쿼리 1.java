class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for (int i = 0; i < queries.length; i++) {
            arr[queries[i][0]] += 1;
            
            while(queries[i][0] != queries[i][1]) { 
                int temp = (queries[i][0]+1);
                queries[i][0] = temp;
                arr[temp] += 1;
            }
        }
        
        return arr;
    }
}