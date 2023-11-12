package developbeginner.bridge.example;

public class Main {
    public static void main(String[] args) {
        Display display1 = new Display(new StringDisplayImpl("Hello, Korea."));
        Display display2 = new CountDisplay(new StringDisplayImpl("Hello, world."));
        CountDisplay display3 = new CountDisplay(new StringDisplayImpl("Hello, universe."));
        display1.display();
        display2.display();
        display3.display();
        display3.multiDisplay(5);
    }
}
