package threads_03_02;

public class WorkerThread implements Runnable {
    private final String message;

    public WorkerThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (START) message = " + message);

        workToBeDone();

        System.out.println(Thread.currentThread().getName() + " (END)");
    }

    private void workToBeDone() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
