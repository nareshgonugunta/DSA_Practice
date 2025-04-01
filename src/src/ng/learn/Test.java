package ng.learn;

import java.util.Arrays;

public class Test {
    public static void main(String args[]) {
        int num[] = {1, 2, 2, 1, 2, 3};
        Arrays.sort(num);
        int uniqueNumCount = 1;
        for (int i = 1; i < num.length; i++) {
            if (num[i] != num[i - 1]) {
                num[uniqueNumCount] = num[i];
                uniqueNumCount++;
            }
        }
        for(int n : num){
            System.out.println(n);
        }
        System.out.println("uniqueNumCount " + uniqueNumCount);
    }

}

