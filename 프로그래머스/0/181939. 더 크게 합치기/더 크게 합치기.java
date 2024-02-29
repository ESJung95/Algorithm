class Solution {
    public int solution(int a, int b) {
        
        int result = 0;

        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(a));
        sb.append(String.valueOf(b));
        int ab = Integer.parseInt(sb.toString());
        sb.setLength(0);
        
        sb.append(String.valueOf(b));
        sb.append(String.valueOf(a));
        int ba = Integer.parseInt(sb.toString());
        
        if (ab >= ba) {
            result = ab;
        } else {
            result = ba;
        }
        
        return result;
        
    }
}