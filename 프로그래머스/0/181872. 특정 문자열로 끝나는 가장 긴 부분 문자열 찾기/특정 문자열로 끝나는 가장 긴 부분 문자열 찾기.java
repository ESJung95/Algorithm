class Solution {
    public String solution(String myString, String pat) {
        
         String result = "";
        int index = myString.lastIndexOf(pat);
        // System.out.println(index);
        result = myString.substring(0, index) + pat;
        return result;
    }
}