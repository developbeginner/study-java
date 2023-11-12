package developbeginner.bridge.practiece.answer3;

public class Main {
    public static void main(String[] args) {
        IncreaseDisplay display1 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay display2 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
        display1.increaseDisplay(4);
        display2.increaseDisplay(6);
    }
}
