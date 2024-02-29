class Solution {
    public int solution(String str1, String str2) {
        
        int result = 0;
        if (str2.contains(str1)) {
            result = 1;
        }
        return result;
    }
}