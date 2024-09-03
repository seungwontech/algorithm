package BaekJoon.Bronze4.Day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2083 {
    public static void main(String[] args) throws IOException {
        //입력 받은 각 회원에 대해 이름과 분류를 출력한다. 성인부 회원이면 'Senior', 청소년부 회원이면 'Junior'를 출력한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String text = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            if (text.equals("#") && age == 0 && weight ==0) {
                break;
            }
            if (age > 17 || weight >= 80) {
                System.out.println(text + " Senior");
            } else {
                System.out.println(text + " Junior");
            }
        }
    }
}
