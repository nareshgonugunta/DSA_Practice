package ng.learn;

public class InfosysTest {

    public static void main(String[] args) {
        System.out.println("started");
        System.out.println(1/10);
        System.out.println(11/10);
        System.out.println(21/10);
        System.out.println(1%10);
        System.out.println(11%10);
        System.out.println(9%10);
        System.out.println(19%10);
        int N = 13;
        int noOfZeros = findNoOfZeros(N);
        System.out.println("No Of Zeros : "+noOfZeros);
        System.out.println("completed");


    }

    private static int findNoOfZeros(int N){ // N = 13
        System.out.println("findNoOfZeros called");
        int result = 0;
        for(int i = 0; i <= N; i++) {
            int num = i;
            if(num == 0){
                result++;
            }
            while(num > 0) {
                if (num % 10 == 0) {
                    result++;
                }
                num = num/10;
            }
        }
        return result;
    }
}
