package Test;
class J{
    public static void J1(){
        System.out.println("A");
    }
}
class I extends J {
    public static void J1(){
        System.out.println("C");
    }
}
public class test_05 {
    public static void main(String[] args) {
        J j1 = new I();
        j1.J1(); // A
        I j2 = new I();
        j2.J1(); // C
    }
}