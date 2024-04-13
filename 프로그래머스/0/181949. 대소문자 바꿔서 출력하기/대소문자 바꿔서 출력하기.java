import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] arr = a.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if ((int)arr[i] >= 97 && (int)arr[i] <= 122) { // 소문자
                arr[i] = Character.toUpperCase(arr[i]);
            } else {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        
        String result = new String(arr);
        System.out.println(result);
    }
}