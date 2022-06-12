package Sort;

public class counting_sort {

    static void countingSort(int[] a, int n, int max) {
        int[] f = new int[max + 1];
        int[] b = new int[n];

        int i;
        for (i = 0; i < n; i++) {
            f[a[i]]++;
        }

        for (i = 1; i <= max; i++) {
            f[i] += f[i - 1];
        }

        for (i = n - 1; i >= 0; i--) {
            b[--f[a[i]]] = a[i];
        }

        for (i = 0; i < n; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 5, 7, 9, 8, 35, 2, 3, 11, 20};
        int len = a.length;

        int max = a[0];
        for (int i = 1; i < len; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        countingSort(a, len, max);

        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
