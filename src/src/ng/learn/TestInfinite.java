package ng.learn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestInfinite {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 99, 8, 9);

        Optional<Integer> max = numbers.stream().max(Comparator.comparing(Integer::intValue));
        System.out.println("max number is :: "+max.get());
        }
}
