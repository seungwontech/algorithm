package BaekJoon.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            char[] s = st.nextToken().toCharArray();
            StringBuilder temp = new StringBuilder();
            for (char c : s) {
                String str = String.valueOf(c);
                for (int k = 0; k < r; k++) {
                    temp.append(str);
                }
            }
            System.out.println(temp);
        }
    }
}
