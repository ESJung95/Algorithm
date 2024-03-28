class Solution {
    public String solution(String[] seoul) {
        
        int x = -1;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                x = i;
                break;
            }
        }
        String strX = String.valueOf(x);
        String result = "김서방은 " + strX + "에 있다";
        return result;
    }
}