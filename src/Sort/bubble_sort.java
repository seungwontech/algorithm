package Sort;

public class bubble_sort {
    public static void main(String[] ages) {
        int i, j, temp;
        int[] array = {1, 10, 3, 4, 7, 5, 6};

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
