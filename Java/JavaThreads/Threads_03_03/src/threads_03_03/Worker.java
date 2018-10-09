package threads_03_03;

import java.util.concurrent.CountDownLatch;

public class Worker extends Thread{

    private final CountDownLatch start;
    private final CountDownLatch end;

    public Worker(CountDownLatch start, CountDownLatch end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        try {
            printInfo("Thread entered run()");
            start.await();
            printInfo("Doing work");
            Thread.sleep(3000);
            end.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void printInfo(String s) {
        System.out.println(System.currentTimeMillis() + ": " + Thread.currentThread() + ": " + s);
    }
}
