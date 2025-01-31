package basic.chap17.sec01.exam01;

import java.util.HashSet;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        Stream<String> stream = set.stream();
//        stream.forEach((name) -> System.out.println(name));
        stream.forEach(System.out::println);
    }
}
