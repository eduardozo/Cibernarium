package threads_01_03;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException{

        System.out.printf("%s is %s alive and in %s state %n and priority %d \n",
                Thread.currentThread().getName(),
                Thread.currentThread().isAlive() ? "" : "not",
                Thread.currentThread().getState(),
                Thread.currentThread().getPriority());

        Runnable r1 = () -> {
            Thread thd = Thread.currentThread();
            System.out.printf("\t\t%s is %s alive and in %s state %n and priority %d \n",
                    thd.getName(),
                    thd.isAlive() ? "" : "not",
                    thd.getState(),
                    thd.getPriority());
        };

        Thread t1 = new Thread(r1,"thread t1");
        System.out.printf("%s is %s alive and in %s state %n and priority %d \n",
                t1.getName(),
                t1.isAlive() ? "" : "not",
                t1.getState(),
                t1.getPriority());
        t1.start();

        Thread t2 = new Thread(r1);
        t2.start();

        Thread.sleep(2000);

        t2.setName("thread 2");
        System.out.printf("%s is %s alive and in %s state %n and priority %d \n",
                t2.getName(),
                t2.isAlive() ? "" : "not",
                t2.getState(),
                t2.getPriority());

        System.out.printf("%s is %s alive and in %s state %n and priority %d \n",
                Thread.currentThread().getName(),
                Thread.currentThread().isAlive() ? "" : "not",
                Thread.currentThread().getState(),
                Thread.currentThread().getPriority());
    }
}
