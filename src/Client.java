public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.setData(100);
        System.out.println("Data from singleton: " + instance.getData());

        Singleton anotherInstance = Singleton.getInstance();
        System.out.println("Data from another instance: " + anotherInstance.getData());
    }
}
