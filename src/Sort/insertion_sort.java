package Sort;

// 필요한 만큼만 이동하기 때문에 선택, 버블 정렬에 비해서 효율적이다.
// 삽입 정렬은 적절한 위치에 삽입하는 정렬알고리즘이라고 할수있다.
public class insertion_sort {
    public static void main(String[] args) {
        int i, j, temp;
        int[] array = {1, 6, 5, 4, 9, 2};
        for (i = 0; i < 5; i++) {
            j = i;
            while (array[j] > array[j + 1]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

