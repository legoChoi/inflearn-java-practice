package basic.chap09.sec02.exam02;

public class A {

    // A 인스턴스 멤버 클래스
    class B {

        // B 인스턴스 필드
        int field1 = 1;

        // B 정적 필드 메서드 (Java 17 부터)
        static int field2 = 2;

        B() {
            System.out.println("B-생성자 실행");
        }

        // B 인스턴스 메서드
        void method1() {
            System.out.println("B-method1 실행");
        }

        // B 정적 메서드 (Java 17 부터)
        static void method2() {
            System.out.println("B-method2 실행");
        }
    }

    // A 인스턴스 메서드
    void useB() {
        B b = new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }
}
