package ng.learn.threads;

public class ThreadExample extends Thread {
    static int sum =0;
    public synchronized void run(){
        for (int i = 0; i < 10; i++) {
            sum = sum+i;
            try {
                sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        notify();
        System.out.println("User Thread : "+sum);
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadExample te = new ThreadExample();
        te.start();
        synchronized (te){
            te.wait();
        }
        System.out.println("Main thread : "+sum);
    }
}
