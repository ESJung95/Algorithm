import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(nums);
        
        sb.append(nums[0]);
        sb.append(" ");
        sb.append(nums[nums.length - 1]);
        
        return sb.toString();
    }
}
