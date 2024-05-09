package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));
        String val = brf.readLine();
        brf.close();
        System.out.println(val.length());
    }
}
