class Solution {
    public int solution(String[] order) {
        // 아메리카노 4500 카페라테 5000
        int result = 0;
        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("americano") || order[i].equals("anything")) {
                result += 4500;
            } else {
                result += 5000;
            }
        }
        
        return result;
    }
}