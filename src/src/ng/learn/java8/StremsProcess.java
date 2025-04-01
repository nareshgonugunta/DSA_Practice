package ng.learn.java8;

import java.util.Arrays;
import java.util.List;

public class StremsProcess {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 2, 4, 5);
        list.stream()
                .forEach(System.out::println);
        System.out.println("-----");
        list.parallelStream()
                .forEach(System.out::println);

    }
}
