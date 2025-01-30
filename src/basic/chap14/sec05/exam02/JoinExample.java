package basic.chap14.sec05.exam02;

public class JoinExample {

    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join(); // 메인 스레드가 sumThread의 종료까지 일시 정지 상태
        } catch (InterruptedException e) {
        }

        System.out.println("1-100의 합: " + sumThread.getSum());
    }
}
