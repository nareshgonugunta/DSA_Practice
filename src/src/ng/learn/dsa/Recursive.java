package ng.learn.dsa;

public class Recursive {
    static int[] a = {3, 7, 2, 4};
    public static void main(String[] args) {


        int sum = sumOfNumbers(a.length);
        System.out.println("sum of given array is : " + sum);

        int n = 8;
        int factValue = fact(n);
        System.out.println("Factorial value of " + n + " is : " + factValue);

        int fibValue = fib(n);
        System.out.println("Fibonacci value of " + n + " is : " + fibValue);

    }

    private static int sumOfNumbers(int length) {
        if( length == 0){
            return a[length];
        }
        return a[length-1] + sumOfNumbers(length-2);
    }

    static int fact(int n) {

        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static int fib(int n) {
        if (n== 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);

    }


}


