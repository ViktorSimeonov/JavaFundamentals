package _9_AssociativeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _Stream_numbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(13);
        numbers.add(68);
        numbers.add(111);
        numbers.add(256);
        Stream<Integer> stream = numbers.stream();

        int[] numbersArray = new int[]{42, 13, 68, 111, 256};
        IntStream stream1 = Arrays.stream(numbersArray);

        OptionalInt max = stream1.max();
        stream1.min();
        stream1.sorted();
        stream1.sum();
        stream1.average();
        stream1.summaryStatistics().getSum();
    }
}
