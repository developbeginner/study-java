package developbeginner.singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("singleton instance created...");
    }

    /**
     * 외부에서 정적 인스턴스에 접근하는 통로를 제공한다.
     * @return
     *      정적 Singleton 인스턴스
     */
    public static Singleton getInstance() {
        return singleton;
    }
}
