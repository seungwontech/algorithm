package BaekJoon.RandomMarathon.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex12780 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        String a = br.readLine();
        System.out.println((text.length() - text.replace(a, "").length())/a.length());
    }
}