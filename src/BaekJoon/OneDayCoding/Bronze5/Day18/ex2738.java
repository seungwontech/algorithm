package BaekJoon.OneDayCoding.Bronze5.Day18;

import java.util.Scanner;

public class ex2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] temp = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[i][j] += sc.nextInt();
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
