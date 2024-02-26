class Solution {
    public int solution(String t, String p) {
        
        int end = p.length();
        int start = 0;
        int result = 0;
         
        while (end <= t.length()) {
            long tt = Long.parseLong(t.substring(start, end));
            if (tt <= Long.parseLong(p)) {
                result++;
            }
                start++;
                end ++;
        }
        
        return result;
    }
}