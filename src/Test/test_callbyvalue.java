package Test;

import java.util.HashMap;
import java.util.Map;

public class test_callbyvalue {
    public static void main(String[] args) {

        Map<String, Object> info = new HashMap<String, Object>();
        info.put("이름", "짱구");
        info.put("국적", "일본");

        System.out.println(info);
        // 결과: {국적=일본, 이름=짱구}
        System.out.println(System.identityHashCode(info));
        addInfo(info);
        System.out.println(info);
        // 결과: {국적=일본, 이름=신짱구, 나이=7살}

        removeInfo(info);
        System.out.println(info);
        // 결과: {이름=신짱구, 나이=7살}

        int a = 1;
        int b = 2;
        System.out.println("변경전");
        System.out.println(a);
        System.out.println(b);
        swap(a, b);
        System.out.println("변경후");
        System.out.println(a);
        System.out.println(b);
    }

    /**
     * 추가
     * @param info
     */
    public static void addInfo(Map<String, Object> info) {
        System.out.println(System.identityHashCode(info));
        Map<String, Object> rtnMap = info;
        System.out.println(System.identityHashCode(rtnMap));
        rtnMap.put("나이", "7살");
        rtnMap.put("이름", "신짱구");
    }

    /**
     * 삭제
     * @param info
     */
    public static void removeInfo(Map<String, Object> info) {
        Map<String, Object> rtnMap = info;
        rtnMap.remove("국적");
    }

    /**
     * 교환
     * @param a
     * @param b
     */
    public static void swap(int a, int b) {
        a = 100;
        b = 200;
    }
}
