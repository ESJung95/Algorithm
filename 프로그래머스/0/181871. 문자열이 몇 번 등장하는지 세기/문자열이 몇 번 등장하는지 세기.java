class Solution {
    public int solution(String myString, String pat) {
        
        int start = 0;
        int length = pat.length();
        int result = 0;
        while (length <= myString.length()) {
            if (myString.substring(start, length).equals(pat)) {
                result++;
            }
                start++;
                length++;
        }
        
        return result;
    }
}