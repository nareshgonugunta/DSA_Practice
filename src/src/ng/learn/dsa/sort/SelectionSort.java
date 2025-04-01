package ng.learn.dsa.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 7, 9, 3};
        int temp;
        int minIndex;

        for (int i=0; i< arr.length; i++){
            minIndex = i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    temp = arr[minIndex];
                    arr[minIndex] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
