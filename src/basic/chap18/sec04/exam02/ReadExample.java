package basic.chap18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

    public static void main(String[] args) throws IOException {
        Reader reader = null;

        reader = new FileReader("./src/basic/chap18/sec04/exam01/test.db");
        while (true) {
            int data = reader.read();
            if (data == -1) break;
            System.out.print((char) data);
        }
        reader.close();
        System.out.println();

        reader = new FileReader("./src/basic/chap18/sec04/exam01/test.db");
        char[] data = new char[100];

        while (true) {
            int num = reader.read(data);
            if (num == -1) break;
            for (int i = 0; i < num; i++) {
                System.out.print(data[i]);
            }
        }
        reader.close();
    }
}
