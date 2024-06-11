package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex11944 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String rtn = "";
        for (int i = 0; i < n; i++) {
            rtn += n;
        }
        if (n < m) {
            System.out.println(rtn);
        } else {
            System.out.println(rtn.substring(0, m));
        }
    }
}