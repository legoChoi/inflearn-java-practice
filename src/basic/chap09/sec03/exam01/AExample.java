package basic.chap09.sec03.exam01;

public class AExample {

    public static void main(String[] args) {
        A.B b = new A.B();
        System.out.println(b.filed1);
        b.method1();

        System.out.println(A.B.filed2);
        A.B.method2();
    }
}
