class Solution {
    boolean solution(String s) {
        
        boolean result = true;
        int pCnt = 0;
        int yCnt = 0;
        s = s.toLowerCase();
        
        for (String item : s.split("")) {
            if (item.equals("p")) {
                pCnt++;
            } else if (item.equals("y")) {
                yCnt++;
            }
        }
        
        if (pCnt != yCnt) {
            result = false; 
        }

        return result;
    }
}