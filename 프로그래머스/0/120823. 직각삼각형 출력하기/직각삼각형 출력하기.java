import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = i;
            while(t >= 0) {
                System.out.print("*");
                t--;
            }
            System.out.println();
        }
    }
}