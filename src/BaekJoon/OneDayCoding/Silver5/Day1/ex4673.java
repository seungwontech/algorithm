package BaekJoon.OneDayCoding.Silver5.Day1;

public class ex4673 {
    public static void main(String[] args) {
        boolean[] temp = new boolean[10001];
        for (int i = 1; i <= 10000; i++) {
            int s = i;

            char[] charTemp = String.valueOf(s).toCharArray();

            for (int j = 0; j < charTemp.length; j++) {
                s += Integer.parseInt(String.valueOf(charTemp[j]));
            }

            if (s < 10001) {
                temp[s] = true;
            }
        }
        for (int i = 1; i <= 10000; i++) {
            if (!temp[i]) {
                System.out.println(i);
            }
        }
    }
}
