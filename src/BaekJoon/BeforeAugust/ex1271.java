package BaekJoon.BeforeAugust;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class ex1271 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());
        System.out.println(a.divide(b));
        System.out.println(a.mod(b));
    }
}
