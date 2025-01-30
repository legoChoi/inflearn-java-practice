package basic.chap14.sec05.exam01;

import java.awt.*;

public class SleepExample {

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i <5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
