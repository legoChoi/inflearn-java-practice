package basic.chap09.sec03.exam01;

public class A {

    static class B {

        int filed1 = 1;
        static int filed2 = 2;

        B() {
            System.out.println("B-생성자 실행");
        }

        void method1() {
            System.out.println("B-method1 실행");
        }

        static void method2() {
            System.out.println("B-method2 실행");
        }
    }
}
