package ng.learn.dsa.sort;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MergeSort {

    public static void main(String[] args) {

        List<String> courses = List.of("java", "python","c", "java");
        courses.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().forEach(System.out::println);

        int[] arr = {4, 1, 2, 7, 9};
        sort(arr);
        System.out.println("Merge sort time complexity is O(nlogn)");
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        int length = arr.length;
        if(length < 2) return;

        int mid = length/2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        for(int i=0; i<mid; i++){
            left[i] = arr[i];
        }
        for(int i = mid; i<length; i++){
            right[i-mid] = arr[i];
        }
        sort(left);
        sort(right);

        merge(left, right, arr);
    }

    private static void merge(int[] left, int[] right, int[] arr) {
        int i=0, j=0, k=0;
        while(i<left.length &&  j<right.length){
            if (left[i] <= right[j]){
                arr[k] = left[i];
                k++; i++;
            } else {
                arr[k] = right[j];
                j++; k++;
            }
        }
        while(j < right.length){
            arr[k++] = right[j++];
        }
        while(i < left.length){
            arr[k++] = left[i++];
        }

    }
}
