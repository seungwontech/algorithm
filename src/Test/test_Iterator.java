package Test;

import java.util.*;

public class test_Iterator {
    public static void main(String[] args) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> map0 = new HashMap<>();
        map0.put("name", "맹구");

        Map<String, Object> map1 = new HashMap<>();
        map1.put("name", "짱구");

        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "철수");

        Map<String, Object> map3 = new HashMap<>();
        map3.put("name", "짱아");

        list.add(map0);
        list.add(map1);
        list.add(map2);
        list.add(map3);

        String onlyFamily = "Y";

        if ("Y".equals(onlyFamily)) {

            for (Iterator<Map<String, Object>> it = list.iterator(); it.hasNext(); ) {
                Map<String, Object> map = it.next();

                String name = String.valueOf(map.get("name"));
                if (!"짱구".equals(name) && !"짱아".equals(name)) {
                    it.remove();
                }
            }
        }

        System.out.println(list);
        // 결과: [{name=짱구}, {name=짱아}]
    }
}
