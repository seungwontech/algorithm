package BaekJoon.Greedy.Bronze1;

import java.util.Scanner;

public class ex4796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            int L = sc.nextInt();
            int P = sc.nextInt();
            int V = sc.nextInt();
            if (L == 0 && P == 0 && V == 0) {
                break;
            }
            int maxDay = L * (V / P) + Math.min((V % P), L);
            System.out.println("Case " + caseNumber + ": " + maxDay);
            caseNumber++;
        }
    }
}
