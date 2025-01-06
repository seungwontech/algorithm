package Test;

public class test_StringBufferVsStringBuilderMultiThreadTest {
    private static final int ITERATIONS = 10_000;

    public static void main(String[] args) throws InterruptedException {
        // Test StringBuffer
        StringBuffer stringBuffer = new StringBuffer("X");
        runMultiThreadTest(stringBuffer, "StringBuffer");

        // Test StringBuilder
        StringBuilder stringBuilder = new StringBuilder("X");
        runMultiThreadTest(stringBuilder, "StringBuilder");
    }

    private static void runMultiThreadTest(Object stringObject, String objectType) throws InterruptedException {
        int numberOfThreads = 10; // Number of threads
        Thread[] threads = new Thread[numberOfThreads];

        Runnable task = () -> {
            for (int i = 0; i < ITERATIONS; i++) {
                if (stringObject instanceof StringBuffer) {
                    ((StringBuffer) stringObject).append("X");
                } else if (stringObject instanceof StringBuilder) {
                    ((StringBuilder) stringObject).append("X");
                }
            }
        };

        // Create and start threads
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println(objectType + " final length: " + getObjectLength(stringObject));
    }

    private static int getObjectLength(Object stringObject) {
        if (stringObject instanceof StringBuffer) {
            return ((StringBuffer) stringObject).length();
        } else if (stringObject instanceof StringBuilder) {
            return ((StringBuilder) stringObject).length();
        }
        return -1;
    }
}
