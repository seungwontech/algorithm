package Test;

public class test_replace {
    public static void main(String[] args) {
        String a = " 3 ";
        String b = "null";
        String c = "";
        String d = null;

        a.replaceAll(" ", "");
        b.replaceAll(" ", "");
        c.replaceAll(" ", "");
        //d.replaceAll(" ", ""); //java.lang.NullPointerException

    }
}
