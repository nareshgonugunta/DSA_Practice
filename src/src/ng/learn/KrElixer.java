package ng.learn;

import java.util.Arrays;
import java.util.List;

public class KrElixer {

    public static void main(String[] args) {


        List<Integer> wholeNumbers = Arrays.asList(1, 3, 1,2, 9, 20);

        Integer firstEvenNumber = wholeNumbers.stream().filter(n -> n % 2 == 0).findFirst().orElse(0);
        System.out.println("First even number : "+firstEvenNumber);

        String input ="ABC$D%EF$";
        String output="FED$C%BA$";
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length -1;

        while( left < right){
            if(!Character.isLetter(chars[left])){
                left++;
            } else if(!Character.isLetter(chars[right])){
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Original String is : "+new String(chars));

        AddNumbers numbers = (a, b) -> {
            return  a+b;
        };

        int add = numbers.add(1, 2);
        System.out.println("addition of 2 numbers is : "+add);
    }

}


@FunctionalInterface
interface AddNumbers{

    int add(int a, int b);

}