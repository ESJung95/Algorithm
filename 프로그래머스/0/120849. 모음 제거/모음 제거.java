class Solution {
    public String solution(String my_string) {
        String result = "";

        result = my_string.replaceAll("[aeiou]", "");

        return result;
    }
}