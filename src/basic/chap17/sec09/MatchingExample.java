package basic.chap17.sec09;

import java.util.Arrays;

public class MatchingExample {

    public static void main(String[] args) {
        int[] intArr = {2, 4, 6};

        boolean result = Arrays.stream(intArr)
                .allMatch(i -> i % 2 == 0);
        System.out.println("모두 2의 배수인가? " + result);

        result = Arrays.stream(intArr)
                .anyMatch(i -> i % 3 == 0);
        System.out.println("하나라도 3의 배수가 있는가? " + result);

        result = Arrays.stream(intArr)
                .noneMatch(i -> i % 3 == 0);
        System.out.println("3의 배수가 없는가? " + result);
    }
}
