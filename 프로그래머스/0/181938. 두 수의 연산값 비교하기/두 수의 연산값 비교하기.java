class Solution {
    public int solution(int a, int b) {
        
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(a));
        sb.append(String.valueOf(b));
        int side = Integer.parseInt(sb.toString());
        int multi = 2 * a * b;
        
        int max = side > multi ? side : multi;
        int result = max;
        if (side == multi) {
            result = side;
        } 
        
        return result;
    }
}