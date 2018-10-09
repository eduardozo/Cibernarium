package threads_03_03;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) {

        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch end = new CountDownLatch(4);

        for (int i = 0; i < 5; i++) {
            new Thread(new Worker(start, end)).start();
        }

        try {
            System.out.println("Main thread doing something");
            Thread.sleep(1000);
            start.countDown();
            System.out.println("Main thread doing something else");
            end.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
