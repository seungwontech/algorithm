package BaekJoon.OneDayCoding.Silver5.Day5;

import java.util.Scanner;

public class ex1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int index = 666;
        while(n > count){
            String temp = String.valueOf(index);
            if(temp.contains("666")) {
                count++;
            }
            index++;
        }
        System.out.println(index - 1);
    }
}
