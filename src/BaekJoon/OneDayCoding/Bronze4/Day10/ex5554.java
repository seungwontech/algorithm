package BaekJoon.OneDayCoding.Bronze4.Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int a = Integer.parseInt(br.readLine());
            sum += a;
        }
        System.out.println(sum / 60);
        System.out.println(sum % 60);
    }
}
