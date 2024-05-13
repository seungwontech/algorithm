package BaekJoon;

import java.util.Scanner;

public class ex2441 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = n - i; k < n; k++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
