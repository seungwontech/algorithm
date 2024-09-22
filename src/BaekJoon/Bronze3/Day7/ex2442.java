package BaekJoon.Bronze3.Day7;

import java.util.Scanner;

public class ex2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i < n; i++){
            for (int j = 0; j < n + i; j++){
                if(n-i-j <= 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
