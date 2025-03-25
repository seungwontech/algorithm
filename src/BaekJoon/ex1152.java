package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] text = br.readLine().split(" ");
        int count = 0;
        for (int i = 0; i < text.length; i++) {
            String temp = String.valueOf(text[i]);
            System.out.println(i+":"+temp);
            if (!temp.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
