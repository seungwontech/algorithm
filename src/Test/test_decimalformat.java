package Test;

import java.text.DecimalFormat;

public class test_decimalformat {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###,###");
        String bbr = "90000000000";
        System.out.println(df.format(Long.parseLong(bbr))); // 90,000,000,000

    }
}
