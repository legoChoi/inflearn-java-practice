package basic.chap18.sec06;


import java.io.*;

public class CharacterConvertStreamExample {

    public static void main(String[] args) throws Exception {
        write("문자 변환 스트림을 사용합니다.");
        String data = read();
        System.out.println(data);
    }

    public static void write(String str) throws Exception {
        OutputStream os = new FileOutputStream("./src/basic/chap18/sec06/test.db");
        Writer writer = new OutputStreamWriter(os, "UTF-8"); // 보조 스트림 연결
        writer.write(str);
        writer.flush();
        writer.close();
    }

    public static String read() throws Exception {
        InputStream is = new FileInputStream("./src/basic/chap18/sec06/test.db");
        Reader reader = new InputStreamReader(is, "UTF-8"); // 보조 스트림 연결
        char[] data = new char[100];
        int num = reader.read(data);
        reader.close();

        return new String(data, 0, num);
    }
}
