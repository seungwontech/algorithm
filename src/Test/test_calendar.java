package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test_calendar {
    public static void main(String[] args) {
        SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");

        String a = "20200309";
        Calendar cal = Calendar.getInstance();
        if (Integer.parseInt(a) <= 20200229) {
            System.out.println("a");
        }
        try {
            Date dt = dtFormat.parse(a);
            cal.setTime(dt);
            cal.add(Calendar.YEAR, 1);// 날짜 2020 02 29 : 윤년 2021 02 28
            System.out.println(dtFormat.format(cal.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
