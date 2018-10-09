package threads_02_03;

public class Main {

    public static void main(String[] args) {

        Countdown CD = new Countdown();

        Runnable r = () -> {
            synchronized (CD) {
                CD.printCount();
            }
        };

        Thread one = new Thread(r, "One");
        Thread two = new Thread(r, "Two");

        one.start();
        two.start();
    }
}
