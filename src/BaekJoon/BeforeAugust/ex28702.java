package BaekJoon.BeforeAugust;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = 0;
        String answer = "";
        for (int i = 0; i < 3; i++) {
            String str = br.readLine();
            if (Character.isDigit(str.charAt(0))) {
                val = Integer.parseInt(str) + 3 - i;
                break;
            }
        }
        if (val % 15 == 0) {
            answer = "FizzBuzz";
        } else if (val % 3 == 0) {
            answer = "Fizz";
        } else if (val % 5 == 0) {
            answer = "Buzz";
        } else {
            answer = String.valueOf(val);
        }

        System.out.println(answer);
    }
}