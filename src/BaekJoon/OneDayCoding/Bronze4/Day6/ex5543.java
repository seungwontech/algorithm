package BaekJoon.OneDayCoding.Bronze4.Day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        int abcMin = Math.min(a,Math.min(b,c));
        int deMin = Math.min(d,e);
        System.out.println(abcMin + deMin - 50);
    }
}
