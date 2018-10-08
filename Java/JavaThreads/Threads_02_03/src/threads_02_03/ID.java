package threads_02_03;

public class ID {
    private static int counter;
    public synchronized int  getID() {
        return counter++;
    }
}
