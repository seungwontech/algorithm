package BaekJoon.Bronze5.Day17;

import java.util.Scanner;

public class ex25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int repeat = n/4;
        String temp = "";
        for(int i = 0; i < repeat; i++){
            temp += "long ";
        }
        System.out.println(temp + "int");
    }
}
