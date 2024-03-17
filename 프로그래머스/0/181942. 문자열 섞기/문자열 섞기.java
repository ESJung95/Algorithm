import java.util.*;
class Solution {
    public String solution(String str1, String str2) {
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        int length = str1.length() + str2.length();
        char[] temp = new char[length];
        
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            temp[index] = arr1[i];
            index++;
            temp[index] = arr2[i];
            index++;
        }
        
        String result = new String(temp);
        return result;
        
    }
}