class Solution {
    public boolean solution(int x) {
        String str = String.valueOf(x);
        int sum = 0;
        for (String item : str.split("")) {
            sum += Integer.parseInt(item);
        }
        boolean result = false;
        if (x % sum == 0) {
            result = true;
        }
        
        return result;
    }
}