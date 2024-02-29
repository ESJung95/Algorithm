class Solution {
    public String solution(String my_string, int n) {
        // 뒤에서 n까지 return
        int num = my_string.length() - n;
        return my_string.substring(num, my_string.length());
    }
}