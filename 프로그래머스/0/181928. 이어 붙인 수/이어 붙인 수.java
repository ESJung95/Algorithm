class Solution {
    public int solution(int[] num_list) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for (int item : num_list) {
            if (item % 2 == 0) {
                sb2.append(String.valueOf(item));
            } else {
                sb1.append(String.valueOf(item));
            }
        }
        
        int odd = Integer.parseInt(sb1.toString());
        int even = Integer.parseInt(sb2.toString());
        return odd + even;
    }
}