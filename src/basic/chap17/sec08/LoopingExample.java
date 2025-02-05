package basic.chap17.sec08;

import java.util.Arrays;

public class LoopingExample {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(System.out::println); // peek 은 중간 처리임 최종 처리가 필요

        int total = Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(System.out::println)
                .sum();
        System.out.println("total = " + total);
        System.out.println();

        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .forEach(System.out::println); // forEach 는 최종 처리
    }
}
