package basic.chap14.sec06.exam01;

public class User2Thread extends Thread{

    public Calculator calculator;

    public User2Thread() {
        setName("User2Thread");
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory2(50);
    }
}
