package BaekJoon.OneDayCoding.Bronze4.Day1;

import java.util.Scanner;

public class ex2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                if (j >= i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
