class Solution {
    public String solution(String my_string, int k) {
        
        StringBuilder sb = new StringBuilder(my_string);
        int cnt = 1;
        while (cnt < k) {
            sb.append(my_string);
            cnt++;
        }
        
        return sb.toString();
    }
}