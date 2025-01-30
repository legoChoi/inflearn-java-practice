package basic.chap14.sec06.exam01;

public class Calculator {

    private int memory;

    public synchronized void setMemory1(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }

    public synchronized void setMemory2(int memory) {
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        }
    }
}
