package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class test_01 {
    public static void main(String[] args) {

        String a = "";
        System.out.println(a.isEmpty());

        List<Map<String, Object>> list1 = new ArrayList<Map<String, Object>>();

        if (list1.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        List<String> list2 = new ArrayList();

        if (list2.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
