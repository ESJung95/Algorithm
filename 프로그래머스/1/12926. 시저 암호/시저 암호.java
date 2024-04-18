class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {

            if (charArr[i] == ' ') {
                sb.append(" ");
            } else if (charArr[i] + n > 122) {
                sb.append((char)(charArr[i] + n - 26));
            } else if (charArr[i] + n > 90 && charArr[i] < 97) {
                sb.append((char)(charArr[i] + n - 26));
            } else {
                sb.append((char)(charArr[i] + n));
            }
        }
        
        return sb.toString();
    }
}