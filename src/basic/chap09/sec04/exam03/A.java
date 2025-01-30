package basic.chap09.sec04.exam03;

public class A {

    public void method1(int arg) {
        int var = 1;

        class B {

            void method2() {
                System.out.println("arg: " + arg);
                System.out.println("var: " + var);

                // arg = 2; // (x) 로컬 클래스 내부에선 값을 변경 x - final 설정
                // var = 2; // (x) 로컬 클래스 내부에선 값을 변경 x - final 설정
            }
        }
    }
}
