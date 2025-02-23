package BaekJoon.OneDayCoding.Bronze4.Day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 시
        int b = Integer.parseInt(st.nextToken()); // 분
        int c = Integer.parseInt(st.nextToken()); // 초
        int n = Integer.parseInt(br.readLine());

        b += n / 60;
        c += n % 60;

        b += c / 60;
        c = c % 60;

        a += b / 60;
        b = b % 60;

        a = a % 24;

        System.out.println(a + " " + b + " " + c);
    }
}
