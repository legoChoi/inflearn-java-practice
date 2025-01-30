package basic.chap14.sec07.exam03;

public class PrintThread extends Thread {
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {
            System.out.println("실행 중");

            if (Thread.interrupted()) { // Thread.interrupted() or isInterrupted()
                break;
            }
        }

        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
