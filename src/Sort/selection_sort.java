package Sort;

public class selection_sort {
    // 선택 정렬 장단점
    // 장점 : 비교하는 횟수에 비해 교환이 적게 일어난다.
    // 단점 : 정렬 시간이 오래 걸린다.
    // 선택 정렬의 시간복잡도는 o(n^2) 입니다.
    private static void sort(int[] a) {
        int size = a.length;
        int min;

        for (int i = 0; i < size; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            swap(a, min, i);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {1, 10, 4, 8, 5, 2};
        sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[i] : " + a[i]);
        }
    }
}
