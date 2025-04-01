package ng.learn;

import java.util.*;

public class BottomLineTest {

    public static void main(String[] args) {
        System.out.println(findFirstRepeatedChar("ababcc"));
        System.out.println(findFirstRepeatedChar("abcca"));

        int[][] matrixArry = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int target = 51;
        System.out.println(findIsElementPresent(matrixArry, target));
    }
    
    public static Character findFirstRepeatedChar(String name){

        Map<Character, Integer> resultMap = new HashMap<>();
        Character out = name.chars().mapToObj(c -> (char) c)
                .filter(c -> {
                    int count = resultMap.getOrDefault(c, 0);
                    resultMap.put(c, count + 1);
                    return count >= 1;
                }).findFirst()
                .orElse(null);
        return out;
    }


    // n * n kth elements
    //1 2 3
    //4 5 11
    //7 6 9

    public static boolean findIsElementPresent(int[][] numbers, int target){

        int len = numbers.length;

        for(int i=0; i<len; i++){
            for (int j=0; j<1; j++){
                if(numbers[i][j] > target){
                    return true;
                }
            }
        }
        return false;
    }


   /* public static int[] sumOfKthElement(int[] arr, int k){
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(arr);
        int sum = 0;
        int temp = k;
        for (int i = 0; i<arr.length; i++){
            if(k < arr[i] && ){
                temp = temp-arr[i];
            }
            if(temp == 0){
                resultList.add();
                return
            }
        }
    }*/
    
}
