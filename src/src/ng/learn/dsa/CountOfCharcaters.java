package ng.learn.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountOfCharcaters {

    public static void main(String[] args) {
         //String word = "javajavajavajava";
         //word.toCharArray();
        List<Integer> numbers = Arrays.asList(-2,11,0,-1,-2,0,-1,-1,99,99,0);
        List<Integer> uniqueNumbers = numbers.stream()
                                             .distinct()
                                             .toList();

        for(int i=0; i< numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
