import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) { 
                if (arr[j] > queries[i][2]) {
                    list.add(arr[j]);
                }
            }
            int min = 1000000;
            if (list.size() == 0) {
                result[i] = -1;
            } else {
                for (int k = 0; k < list.size(); k++) {
                    if (list.get(k) < min) {
                        min = list.get(k);
                    }
            }
                
                result[i] = min;
                list.clear();
            
        }
        
    }
        
        return result;
    }
}
