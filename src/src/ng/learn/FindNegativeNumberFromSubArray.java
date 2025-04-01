package ng.learn;

import java.util.Deque;
import java.util.LinkedList;

public class FindNegativeNumberFromSubArray {

    public static void main(String[] args) {

        int[] numbers = {-12, 1, 8,-7, 15, -30, 16, 28};
        int k = 3;
        /*int[] negativeArray = findNegativeNumbersFromSubArray(numbers, k);
        for (int i : negativeArray) {
            System.out.println(i);
        }*/
        printFirstNegativeInteger(numbers, k);
    }
    //Input : arr[] = {-8, 2, 3, -6, 10}, k = 2
    //Output : -8 0 -6 -6

    public static int[] findNegativeNumbers(int[] numbers, int k){
        int[] result = new int[numbers.length-k+1];

        int initial = 0;
        int target  = numbers.length-k+1;
        while(initial < target){
            int temp =  numbers[initial];
            if(numbers[initial] > numbers[initial+1]){
                temp =  numbers[initial+1];
            }
            result[initial] = temp < 0 ? temp : 0;
            initial++;
        }
        return result;
    }


    public static int[] findNegativeNumbersFromSubArray(int[] numbers, int k){
        int[] result = new int[numbers.length-k+1];

        for(int i = 0; i<numbers.length-k+1; i++){
            int temp = numbers[i];
            for(int j = i; j < i+k-1; j++){
                if(numbers[j] > numbers[j+1]){
                    temp = numbers[j+1];
                }
            }
            result[i] = temp < 0 ? temp : 0;
        }
        return result;
    }


    public static void printFirstNegativeInteger(int[] numbers, int k){
        int n =  numbers.length;
        Deque<Integer> deque = new LinkedList<>();
        for (int i=0; i<k; i++){
            if(numbers[0] < 0) {
                deque.addLast(i);
            }
        }
        for(int i=k; i < n; i++) {
            if (!deque.isEmpty()) {
                System.out.println(numbers[deque.peekFirst() + 1]);
            } else {
                System.out.println("0 ");
            }
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            if(numbers[i] < 0){
                deque.addLast(i);
            }
        }
        if(!deque.isEmpty()){
            System.out.println(deque.peekFirst() + " ");
        } else {
            System.out.println("0 ");
        }
    }
}
