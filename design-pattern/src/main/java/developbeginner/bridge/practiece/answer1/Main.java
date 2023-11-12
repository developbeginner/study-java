package developbeginner.bridge.practiece.answer1;

import developbeginner.bridge.example.StringDisplayImpl;

public class Main {
    public static void main(String[] args) {
        RandomDisplay display = new RandomDisplay(new StringDisplayImpl("Hello, Korea."));
        display.randomDisplay(5);
    }
}
