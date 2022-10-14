package Test;

class P {
    public void f1() {
        System.out.println("A");
    }

    public void f2() {
        System.out.println("B");
    }
}

class C extends P {
    public void f1() {
        System.out.println("C");
    }

    public void f3() {
        System.out.println("D");
    }
}

public class test_04 {
    public static void main(String[] args) {
        C a = new C();
        a.f1();
        a.f2();
        a.f3();
    }
}