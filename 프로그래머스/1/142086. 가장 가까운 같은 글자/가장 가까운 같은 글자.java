class Solution {
    public int[] solution(String s) {
        // 앞에 있고 가까운 곳에 있는 같은 글자
        char[] arr = s.toCharArray();
        int[] result = new int[arr.length];
        result[0] = -1;
        
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    result[i] = (i - j);
                    break;
                } else {
                    result[i] = -1;
                }
            }
        }
        
        return result;
        
    }
}