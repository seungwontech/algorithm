package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 단계별로 풀어보기 - 정렬
// 문제 번호 1427 - 소트인사이드
public class ex1427 {
    public static void main(String[] args) throws IOException {

        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = brf.readLine().toCharArray();

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        brf.close();

    }
}