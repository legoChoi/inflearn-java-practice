package basic.chap14.sec03.exam03;

import java.awt.*;

public class BeepPrintExampleV0 {

    public static void main(String[] args) {
        Workthread workthread = new Workthread();

        workthread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }

    static class Workthread extends Thread {
        @Override
        public void run() {
            Toolkit toolkit = Toolkit.getDefaultToolkit();

            for (int i = 0; i < 5; i++) {
                toolkit.beep();

                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }
    }
}
