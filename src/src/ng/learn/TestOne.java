package ng.learn;

public class TestOne {

    public static void main(String[] args) {

         Runnable r = () -> {
            System.out.println("Hello");
         };
         Thread t =  new Thread(r);
         t.start();
        System.out.println("world");
    }


}
