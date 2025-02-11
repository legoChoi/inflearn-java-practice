package basic.chap18.sec07.exam01;

import java.io.*;

public class BufferExample {

    public static void main(String[] args) throws IOException {
        String originalFilePath1 = BufferExample.class.getResource("originalFile1.png").getPath();
        String targetFilePath1 = "./src/basic/chap18/sec07/exam01/originalFile1.png";

        InputStream fis = new FileInputStream(originalFilePath1);
        OutputStream fos = new FileOutputStream(targetFilePath1);

        String originalFilePath2 = BufferExample.class.getResource("originalFile2.png").getPath();
        String targetFilePath2 = "./src/basic/chap18/sec07/exam01/originalFile2.png";
        InputStream fis2 = new FileInputStream(originalFilePath2);
        OutputStream fos2 = new FileOutputStream(targetFilePath2);
        InputStream bis = new BufferedInputStream(fis2);
        OutputStream bos = new BufferedOutputStream(fos2);

        // 버퍼를 사용하지 않고 복사
        long nonBufferTime = copy(fis, fos);
        System.out.println("버퍼 미사용:\t" + nonBufferTime + " ns");

        long bufferTime = copy(bis, bos);
        System.out.println("버퍼 사용:\t" + bufferTime + " ns");

        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }


    public static long copy(InputStream is, OutputStream os) throws IOException {
        long start = System.nanoTime();
        while (true) {
            int data = is.read();
            if (data == -1) break;
            os.write(data);
        }
        os.flush();

        long end = System.nanoTime();
        return end - start;
    }
}
