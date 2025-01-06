package Test;

public class test_StringVsStringBufferVsStringBuilderTest {

    public static void main(String[] args) {
        int iterations = 100000;

        long startTime = System.currentTimeMillis();
        testString(iterations);
        long endTime = System.currentTimeMillis();
        System.out.println("String execution time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        testStringBuffer(iterations);
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer execution time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        testStringBuilder(iterations);
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder execution time: " + (endTime - startTime) + " ms");
    }

    private static void testString(int iterations) {
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "X";
        }
    }

    private static void testStringBuffer(int iterations) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("X");
        }
    }

    private static void testStringBuilder(int iterations) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("X");
        }
    }
}
