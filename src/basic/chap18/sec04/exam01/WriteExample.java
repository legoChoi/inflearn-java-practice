package basic.chap18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("./src/basic/chap18/sec04/exam01/test.db");

        char a = 'A';
        writer.write(a);
        char b = 'B';
        writer.write(b);

        char[] arr = { 'C', 'D', 'E'};
        writer.write(arr);

        writer.write("FGH");

        writer.flush();
        writer.close();
    }
}
