package Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class test_distinct {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("짱구");
        list.add("짱구");
        list.add("철수");
        list.add("철수");
        list.add("맹구");
        list.add("철수");

        System.out.println(list.size()); // 결과: 6
        System.out.println(list.stream().distinct().count()); // 결과: 3

        // list에 중복된 값이 있으면 distinct().count()와 list.size의 값이 다릅니다.
        if (list.stream().distinct().count() != list.size()) {

            // distinct()한 값을 collect(Collectors.toList())를 통해 새로운 컬렉션에 수집해 담습니다.
            List<String> dpcnRemoveList = list.stream().distinct().collect(Collectors.toList());

            System.out.println(dpcnRemoveList);
            // 결과: [짱구, 철수, 맹구]

            // dpcnRemoveList을 통해 list을 remove()하여 제거합니다.
            for (String value : dpcnRemoveList) {
                list.remove(value);
            }

            System.out.println(list);
            // 결과: [짱구, 철수, 철수]

            // 제거해도 남아 있는 값을 hashSet을 통해 중복을 제거합니다.
            String dpcnName = String.valueOf(new HashSet<String>(list));

            // 중복 값을 확인합니다.
            System.out.println(dpcnName);
            // 결과: [철수, 짱구]
        }
    }

}
