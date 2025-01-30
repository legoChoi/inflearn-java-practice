package chap15.sec08;

import java.lang.reflect.Array;
import java.util.*;

public class ImmutableExample {

    public static void main(String[] args) {
        // List 불변 컬렉션
        List<String> immutableList1 = List.of("a", "b", "c");
//        immutableList1.add("d"); // X

        // Set 불변 컬렉션
        Set<String> immutableSet1 = Set.of("a", "b", "c");
//        immutableSet1.add("d"); // X

        // Map 불변 컬렉션
        Map<Integer, String> immutableMap1 = Map.of(
                1, "a",
                2, "b",
                3, "c"
        );
//        immutableMap1.put(4, "d"); // X

        // List 컬렉션을 불변 컬렉션으로 복사
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        List<String> immutableList2 = List.copyOf(list);

        // Set 컬렉션을 불변 컬렉션으로 복사
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        Set<String> immutableSet2 = Set.copyOf(set);

        // Map 컬렉션을 불변 컬렉션으로 복사
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        Map<Integer, String> immutableMap2 = Map.copyOf(map);

        // 배열로 부터 List 불변 컬렉션 생성
        String[] arr = { "A", "B", "C" };
        List<String> immutableList3 = Arrays.asList(arr);
    }
}
