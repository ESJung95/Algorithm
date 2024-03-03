class Solution {
    public String solution(String my_string, int[][] queries) {
        
        StringBuilder temp = new StringBuilder();
        StringBuilder result = new StringBuilder(my_string);
        
        for (int i = 0; i < queries.length; i++) {
            temp.append(result.substring(queries[i][0], queries[i][1] + 1));
            String reverseStr = temp.reverse().toString();
            result.replace(queries[i][0], queries[i][1] + 1, reverseStr); 
            temp.setLength(0);
        }
        
        return result.toString();
    }
}