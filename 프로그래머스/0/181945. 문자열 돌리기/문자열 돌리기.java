import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (String item : a.split("")) {
            System.out.println(item);
        }
    }
}