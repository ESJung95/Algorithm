class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int result = 0;
        
        if (m == n) {
            if (eq.equals("=")) {
                result = 1;
            }
        } else if (n < m) {
            if (ineq.equals("<")){
                result = 1;
            } 
        } else {
            if (ineq.equals(">")) {
                result = 1;
            }
        }
        return result;
    }
}