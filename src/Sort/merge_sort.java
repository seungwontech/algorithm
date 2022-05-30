package Sort;

import java.util.Scanner;

public class merge_sort {
    static int[] buff;

    static void __mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int i;
            int center = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            // 앞부분을 병합 정렬
            __mergeSort(a, left, center);
            // 뒷부분을 병합 정렬
            __mergeSort(a, center + 1, right);

            for (i = left; i <= center; i++) {
                buff[p++] = a[i];
            }
            while (i <= right && j < p) {
                a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
            }

            while (j < p) {
                a[k++] = buff[j++];
            }
        }
    }

    static void mergeSort(int[] a, int n) {
        buff = new int[n];

        __mergeSort(a, 0, n - 1);

        buff = null;
    }

    public static void main(String[] age) {
        int[] a = {1, 4, 5, 7, 9, 8, 35, 2, 3, 11, 20};
        int n = 11;

        mergeSort(a, n);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        // 결과 1 2 3 4 5 7 8 9 11 20 35

    }
}