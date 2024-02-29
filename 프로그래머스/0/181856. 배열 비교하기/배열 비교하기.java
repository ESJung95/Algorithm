class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        // arr1 크면 1 arr2 크면 -1 같다면 0
        int result = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int item : arr1) {
            sum1 += item;
        }
        for (int item : arr2) {
            sum2 += item;
        }
        
        if (arr1.length == arr2.length) {
            if (sum1 > sum2) {
                result = 1;
            } else if (sum2 > sum1) {
                result = -1;
            }
        } else {
            if (arr1.length > arr2.length) {
                result = 1;
            } else {
                result = -1;
            }
        }
        return result;
    }
}