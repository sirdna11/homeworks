package io.codelex.test.test5;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static <T> double partOf(List<T> list, Predicate<T> condition) {
        long count = list.stream().filter(condition).count();
        return (double) count / list.size();
    }

    public static void main(String[] args) {
        List<String> names = List.of("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, name -> name.length() > 4);
        System.out.println(percent);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, n -> n % 2 == 0);
        System.out.println(evenPercent);
    }
}
