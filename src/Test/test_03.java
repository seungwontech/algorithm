package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class test_03 {
    public static void main(String[] args) {
        int[][] arr = new int[2][5];
        int sum = 0;

        for(int i =0; i < 2; i++){
            for(int j = 0; j< 5; j++){
                if(i%2==0){
                    arr[i][j] = i+j;
                }else {
                    arr[i][j] = i-j;
                }
            }
        }

        for(int i =0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }
}