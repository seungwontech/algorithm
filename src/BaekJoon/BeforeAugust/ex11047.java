package BaekJoon.BeforeAugust;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class ex11047 {

    public static void main(String[] args) throws Exception {
        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(brf.readLine());
        int[] aArr = new int[2];
        for (int i = 0; i < aArr.length; i++) {
            aArr[i] = Integer.parseInt(st.nextToken());
        }
        Integer[] bArr = new Integer[aArr[0]];
        for (int i = 0; i < aArr[0]; i++) {
            bArr[i] = Integer.parseInt(brf.readLine());
        }
        Arrays.sort(bArr, Collections.reverseOrder());
        int money = aArr[1];
        int count = 0;
        for (int value : bArr) {
            count += money / value;
            if (count > 0) {
                money = money % value;
            }
        }
        System.out.println(count);
    }
}