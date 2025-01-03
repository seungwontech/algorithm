package BaekJoon.OneDayCoding.Bronze5.Day11;

import java.util.Scanner;

public class ex10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("1");
        } else {
            int fac = 1;
            for (int i =2; i <= n; i++) {
                fac = fac * i;
            }
            System.out.println(fac);
        }
    }
}
