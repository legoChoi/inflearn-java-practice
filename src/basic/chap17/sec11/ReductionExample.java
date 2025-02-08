package basic.chap17.sec11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReductionExample {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 92),
                new Student("신용권", 95),
                new Student("감자바", 88)
        );

        // 방법 1
        int sum1 = studentList.stream()
                .mapToInt(Student::getScore)
                .sum();

        // 방법 2
        Integer sum2 = studentList.stream()
                .map(Student::getScore)
                .reduce(0, (a, b) -> a + b); // reduce(디폴트 값, Operator)

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}
