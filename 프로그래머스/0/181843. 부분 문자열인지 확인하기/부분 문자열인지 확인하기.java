class Solution {
    public int solution(String my_string, String target) {
        
        int result = 0;
        if (my_string.contains(target)) {
            result = 1;
        }
        
        return result;
    }
}