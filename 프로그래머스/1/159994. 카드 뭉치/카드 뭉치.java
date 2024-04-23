class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        String result = "Yes";
        int index1 = 0;
        int index2 = 0;
        int index = 0; // goal index
        
        while(index < goal.length) {
            if(index1 < cards1.length && cards1[index1].equals(goal[index])) {
                index1++;
                index++;
            } else if(index2 < cards2.length && cards2[index2].equals(goal[index])) {
                index2++;
                index++;
            } else {
                result = "No";
                break;
            }
        }
        return result;
    }
}