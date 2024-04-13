class Solution {
    public int[] solution(int[] arr) {
        
        int length = arr.length;
        int chageLength = 0;
        int i = 0;
        while(true){
            if((int)Math.pow(2,i) == length) {
                return arr;
            } else {
                if((int)Math.pow(2,i) < length) {
                    i++;
                } else {
                    chageLength = (int)Math.pow(2,i);
                    break;
                }
            }
        }
        
        // System.out.println(chageLength);
        int[] result = new int[chageLength];
        for (int j = 0; j < length; j++) {
            result[j] = arr[j];
        }
        
        return result;
    }
}