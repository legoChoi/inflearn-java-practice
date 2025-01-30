package basic.chap15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long start;
        long end;

        // ArrayList
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        end = System.currentTimeMillis();
        System.out.printf("%-17s %d ms \n", "ArrayList 걸린 시간: ", (end - start));

        // LinkedList
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        end = System.currentTimeMillis();
        System.out.printf("%-17s %d ms \n", "LinkedList 걸린 시간: ", (end - start));
    }
}
