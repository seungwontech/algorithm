package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int time = Integer.parseInt(br.readLine());
        B += time / 60;
        C += time % 60;

        B += C / 60;
        C = C % 60;

        A += B / 60;
        B = B % 60;

        A = A % 24;

        System.out.println(A + " " + B + " " + C);
    }
}
