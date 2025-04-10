package BaekJoon.Greedy.Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ex11000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] temp = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); // 시작
            int t = Integer.parseInt(st.nextToken()); // 끝
            temp[i][0] = s;
            temp[i][1] = t;
        }
        Arrays.sort(temp, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(temp[0][1]);

        for(int i =1; i < n; i++) {
            if(pq.peek() <= temp[i][0]) {
                pq.poll();
            }
            pq.add(temp[i][1]);
        }
        System.out.println(pq.size());
    }
}
