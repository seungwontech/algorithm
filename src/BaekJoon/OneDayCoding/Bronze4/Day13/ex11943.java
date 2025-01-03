package BaekJoon.OneDayCoding.Bronze4.Day13;

import java.io.IOException;
import java.util.Scanner;

public class ex11943 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(Math.min(a +d, b +c));
    }
}
