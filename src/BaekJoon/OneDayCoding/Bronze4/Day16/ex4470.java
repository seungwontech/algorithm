package BaekJoon.OneDayCoding.Bronze4.Day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String text = br.readLine();
            System.out.println(i + 1 +". " + text);
        }
    }
}
