package basic.chap14.sec04;

public class ThreadNameExample {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + " 실행");

        for (int i = 0; i < 3; i++) {
            Thread threadA = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " 실행");
            });
            threadA.start();
        }

        Thread chatThread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " 실행");
        });

        chatThread.setName("chat-thread");
        chatThread.start();
    }
}
