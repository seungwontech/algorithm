package Test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test_compareto {
    public static void main(String[] args) {
        try {

            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
            Date now = new Date();
            String dt = fmt.format(now); // 2023-09-12

            Date dt1 = fmt.parse("2023-09-11");
            Date dt2 = fmt.parse("2023-09-12");
            Date dt3 = fmt.parse("2023-09-13");

            System.out.println(dt1.compareTo(fmt.parse(dt))); // -1
            System.out.println(dt2.compareTo(fmt.parse(dt))); // 0
            System.out.println(dt3.compareTo(fmt.parse(dt))); // 1

            Integer i = 2;

            Integer a = 1;
            Integer b = 2;
            Integer c = 3;

            System.out.println(a.compareTo(i)); // -1
            System.out.println(b.compareTo(i)); // 0
            System.out.println(c.compareTo(i)); // 1

            int w = 2;
            int x = 1;
            int y = 2;
            int z = 3;

            System.out.println(Integer.compare(x, w)); // -1
            System.out.println(Integer.compare(y, w)); // 0
            System.out.println(Integer.compare(z, w)); // 1

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
