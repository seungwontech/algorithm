package BaekJoon.OneDayCoding.Bronze3.Day4;

import java.util.Arrays;
import java.util.Scanner;

public class ex10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temp = new int[3];
        temp[0] = sc.nextInt();
        temp[1] = sc.nextInt();
        temp[2] = sc.nextInt();
        Arrays.sort(temp);
        System.out.println(temp[1]);
    }
}
