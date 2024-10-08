package BaekJoon.BeforeAugust;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex10797 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        while (st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            if (number == a) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}