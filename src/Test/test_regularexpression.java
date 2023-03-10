package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test_regularexpression {
    public static void main(String[] args) {
        Pattern m_pattern = Pattern.compile("^[0-9]*$");
        Matcher m1 = m_pattern.matcher("");

        Pattern p_pattern = Pattern.compile("^[0-9]+$");
        Matcher m2 = p_pattern.matcher("");

        System.out.println(m1.find()); // * 기호 결과: true
        System.out.println(m2.find()); // + 기호 결과: false




    }
}
