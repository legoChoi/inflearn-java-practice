package basic.chap17.sec04.exam03;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static int sum;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(i -> sum += i);
        System.out.println("총합: " + sum);
    }
}
