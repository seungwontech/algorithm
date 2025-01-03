package BaekJoon.OneDayCoding.Bronze5.Day18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex10699 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");

        System.out.println(format.format(date));
    }
}
