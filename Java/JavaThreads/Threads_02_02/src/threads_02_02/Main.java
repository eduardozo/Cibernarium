package threads_02_02;

public class Main {
    static int counter = 1;

    public static void main(String[] args) {

        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + " => ID value: " + getID());
        };

        Thread one = new Thread(r, "One");
        one.start();
        Thread two = new Thread(r, "Two");
        two.start();
    }

    public static int getID() {
        return counter++;
    }
}
