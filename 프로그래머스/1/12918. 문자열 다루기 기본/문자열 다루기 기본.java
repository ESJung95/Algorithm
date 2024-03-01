class Solution {
    public boolean solution(String s) {
        
        boolean result = false;
        s = s.toLowerCase();
        
        if (s.length() == 4 || s.length() == 6) {
            if (!s.matches(".*[a-z].*")) {
                result = true;
            }
        }
        return result;
    }
}