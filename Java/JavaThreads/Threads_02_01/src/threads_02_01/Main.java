package threads_02_01;

public class Main {
    static double a = 10;
    static double b;

    public static void main(String[] args) {

        Runnable r1 = () -> {
            if (a == 10) {
                try {
                    Thread.sleep(0); //if sleep(500) or more, b never be 5
                    b = a / 2.0;
                    System.out.println(Thread.currentThread().getName() + ": b = " + b);

                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        Runnable r2 = () -> { a = 12; };


        Thread t1 = new Thread(r1, "Thread A");
        Thread t2 = new Thread(r2, "Thread B");

        t1.start();
        t2.start();
    }
}
