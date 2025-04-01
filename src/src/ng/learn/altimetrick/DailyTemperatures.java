package ng.learn.altimetrick;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] ints = dailyTemperatures(temperatures);
        for (int i: ints) {
            System.out.print(i+" ");
        }
    }

    public static int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i< n; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int previousIndex = stack.pop();
                result[previousIndex] = i-previousIndex;
            }
            stack.push(i);
        }
        return result;

    }
}
