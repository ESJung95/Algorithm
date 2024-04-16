class Solution {
    public String solution(String s) {
        
        String result = "";
        int center = (s.length() / 2);
        
        if (s.length() % 2 != 0) { // 홀수
            result = s.substring(center, center+1);
        } else {
            result = s.substring(center-1, center+1);
        }
        
        return result;
    }
}