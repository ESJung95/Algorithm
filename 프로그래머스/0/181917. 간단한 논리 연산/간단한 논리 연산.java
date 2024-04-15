class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        
        boolean result = false;
        boolean x = true;
        boolean y = true;
        
        if (x1 == false && x2 == false) {
            x = false;
        }
        
        if (x3 == false && x4 == false) {
            y = false;
        }
        
        if (x && y) {
            result = true;
        }
        
        return result;
    }
}