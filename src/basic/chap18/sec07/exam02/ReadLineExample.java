package basic.chap18.sec07.exam02;

import java.io.*;

public class ReadLineExample {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./src/basic/chap18/sec07/exam02/ReadLineExample.java"));

        int lineNo = 1;
        while (true) {
            String str = br.readLine();
            if (str == null) break;

            System.out.println(lineNo + "\t" + str);
            lineNo++;
        }

        br.close();
    }
}
