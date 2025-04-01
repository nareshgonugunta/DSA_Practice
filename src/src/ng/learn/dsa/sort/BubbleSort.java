package ng.learn.dsa.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 3, 21, 7, 9};
        int temp;
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j< arr.length-i; j++) {
                if (arr[j] < arr[j-1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println("Here 2 loops are using so Time complexity is n^2 [n Square]");
        System.out.println(Arrays.toString(arr));
    }
}
