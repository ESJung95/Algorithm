class Solution {
    public int solution(int a, int b, int c) {
        int result = 0;
        if (a == b && a == c) {
            int temp = (a + b + c) * ((a*a) + (b*b) + (c*c)) * (int)(Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));
            result = temp;
        } else if (a != b && a != c && b != c) {
            result = (a + b + c);
        } else {
            result = (a+b+c) * ((a*a) + (b*b) + (c*c));
        }
        
        return result;
    }
}