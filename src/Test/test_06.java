package Test;

public class test_06 {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        for (int k = 0; k < 3; k++) {
            System.out.println(i + ", " + j);
            if (++i > 1 && ++j > 1) {
                System.out.println(i + ", " + j + ", " + k);
                i++;
            }
        }
        System.out.println(i + ", " + j);
        /*  0, 0
            1, 0
            2, 1
            3, 2, 2
            4, 2
        */
    }
}
