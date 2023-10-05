public class SingletonDemo {
    public static void main(String[] args) {
        Runnable getSingletonInstance = () -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " " + singleton.getData());
        };

        for (int i = 0; i < 10; i++) {
            new Thread(getSingletonInstance, "Thread" + i).start();
        }
    }
}
