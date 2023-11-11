package developbeginner.prototype.example;

import developbeginner.prototype.example.framework.Manager;
import developbeginner.prototype.example.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 1. 준비하기
        Manager manager = new Manager();
        UnderlinePen ulPen = new UnderlinePen('-');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');

        // 2. 등록하기
        manager.register("strong message", ulPen);
        manager.register("warning box", mBox);
        manager.register("slash box", sBox);

        // 3. 생성 및 사용
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
