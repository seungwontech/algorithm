package BaekJoon.Bronze5.Day5;

import java.util.Scanner;

public class ex8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
