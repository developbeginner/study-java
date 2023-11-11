package developbeginner.singleton.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("program started...");

        Singleton object1 = Singleton.getInstance(); // Singleton 정적 인스턴스가 생성된다.
        Singleton object2 = Singleton.getInstance();

        if (object1 == object2) {
            System.out.println("object1 equals object2");
        } else {
            System.out.println("object1 not equals object2");
        }

        System.out.println("program ended...");
    }
}
