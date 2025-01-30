package basic.chap14.sec05.exam03;

public class WorkThread extends Thread {

    public boolean work = true;

    public WorkThread(String name) {
        setName(name);
    }

    @Override
    public void run() {
        while (true) {
            if (work) {
                System.out.println(getName() + ": 작업 처리");
            } else {
                Thread.yield(); // 현재 스레드를 실행 대기 상태로, 다른 스레드를 실행 상태로
            }
        }
    }
}
