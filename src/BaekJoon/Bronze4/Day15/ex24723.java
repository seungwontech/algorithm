package BaekJoon.Bronze4.Day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = {1, 2, 4, 8, 16, 32};
        System.out.println(a[n]);
    }
}
