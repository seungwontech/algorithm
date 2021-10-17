package Sort;

// 퀵정렬 : 특정한 값을 기준으로 큰 숫자와 작은 숫자를 서로 교환한 뒤에 배열을 반으로 나눕니다.
public class quick_sort {
    private static void qickSort(int[] data, int start, int end) {
        if (start >= end) {
            return;
        }

        int key = start;
        int i = start + 1;
        int j = end;
        int temp = 0;

        while (i <= j) {
            while (i <= end && data[i] <= data[key]) {
                i++;
            }
            while (j > start && data[j] >= data[key]) {
                j--;
            }
            if (i > j) {
                temp = data[j];
                data[j] = data[key];
                data[key] = temp;
            } else {
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        qickSort(data, start, j - 1);
        qickSort(data, j + 1, end);
    }

    public static void main(String[] age) {
        int number = 6;
        int[] data = {1, 10, 4, 8, 5, 2};
        qickSort(data, 0, number - 1);

        for (int i = 0; i < number; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
