package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class test_02 {
    public static void main(String[] args) {

        String cmprVal = "가";

        ArrayList<String> list = new ArrayList<String>();
        list.add("가");
        list.add("나");

        System.out.println("1 : " + list.contains(cmprVal));

        String[] strArr = {"가", "나", "다"};

        System.out.println("2 : " + Arrays.asList(strArr).contains(cmprVal));

        boolean isCheck = false;
        for (String a : strArr) {
            if (a.equals(cmprVal)) {
                isCheck = true;
            }
        }
        System.out.println("3 : " + isCheck);
    }
}