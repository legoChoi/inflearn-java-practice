package basic.chap17.sec12.exam03;

import basic.chap17.sec12.exam01.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {

    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("감자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        // 성별 별 평균 점수
        Map<String, Double> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(Student::getSex, Collectors.averagingDouble(Student::getScore))
                );

        System.out.println(map);
    }
}
