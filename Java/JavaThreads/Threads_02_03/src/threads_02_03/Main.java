package threads_02_03;

public class Main {
    static int counter = 1;

    public static void main(String[] args) {

        /*Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + " => ID value: " + getID());
        };*/


        Runnable r2 = () -> {
            ID id = new ID();
            System.out.println("ID value: " + id.getID());
        };

        Thread one = new Thread(r2, "One");
        one.start();
        Thread two = new Thread(r2, "Two");
        two.start();
    }

    public static synchronized int getID() {
        return counter++;
    }
}
