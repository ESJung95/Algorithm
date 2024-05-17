class Solution {
    public int[] solution(String s) {
        
        int zeroCnt = 0;
        int cnt = 0;
        
        // 길이를 구하면 사라진 0의 개수를 알 수 있다.
        while(!s.equals("1")) {
            
            int length = s.length();
            s = s.replace("0","");
            zeroCnt += length - s.length();
            
            s = Integer.toBinaryString(s.length()); // 이진 변환
            cnt++;
            
        }
        
        
        int[] result = {cnt, zeroCnt};
        return result;
        
    }
}