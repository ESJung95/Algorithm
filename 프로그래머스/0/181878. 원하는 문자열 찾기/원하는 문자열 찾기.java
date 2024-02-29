class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        int result = 0;
        if (myString.contains(pat)) {
            result = 1;
        }
        
        return result;
    }
}