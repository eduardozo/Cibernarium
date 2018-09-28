package singleton.stat;


public class SingletonClient {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getUniqueInstance();
        System.out.println(singleton.getDescription());
    }
}
