package threads_01_04;

public class ThreadJoinExample {

    public static void main(String[] args) {

        TestJoinClass t1 = new TestJoinClass("t1");
        TestJoinClass t2 = new TestJoinClass("t2");
        TestJoinClass t3 = new TestJoinClass("t3");

        t1.start();
        t2.start();

        try {
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t3.start();

    }
}
