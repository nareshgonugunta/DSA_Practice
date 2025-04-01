package ng.learn.CBA;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Round2 {

    public static void main(String[] args) {

        String name ="naresh";
        Character findFirstNonRepeatedCharacter = name.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(findFirstNonRepeatedCharacter);

        String input = "aavvsgrdrfss";
        Character result = input.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(result);

        String inputOne = "aavvsgrdrfss";
        Character firstNonrepeatedChar =
                inputOne.chars().mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() == 1)
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElse(null);

        System.out.println("FirstNonrepeatedChar is "+firstNonrepeatedChar);

    }
}
