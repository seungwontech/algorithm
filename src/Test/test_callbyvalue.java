package Test;

import java.util.HashMap;
import java.util.Map;

public class test_callbyvalue {
    public static void main(String[] args) {

        Map<String, Object> info = new HashMap<String, Object>();
        info.put("이름", "짱구");
        info.put("국적", "일본");

        System.out.println(info);
        // {국적=일본, 이름=짱구}

        addInfo(info);
        System.out.println(info);
        // {국적=일본, 이름=신짱구, 나이=7살}

        removeInfo(info);
        System.out.println(info);
        // 결과: {이름=신짱구, 나이=7살}
    }

    /**
     * 추가
     * @param info
     */
    public static void addInfo(Map<String, Object> info) {
        Map<String, Object> rtnMap = info;
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
}
