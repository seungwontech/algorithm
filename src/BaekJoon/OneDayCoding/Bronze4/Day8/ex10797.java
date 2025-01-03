package BaekJoon.OneDayCoding.Bronze4.Day8;

import java.util.Scanner;

public class ex10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            if(a == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}
