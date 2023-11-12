package developbeginner.bridge.practiece.answer2;

import developbeginner.bridge.example.CountDisplay;

public class Main {
    public static void main(String[] args) {
        CountDisplay countDisplay = new CountDisplay(new FileDisplayImpl("star.txt"));
        countDisplay.multiDisplay(3);
    }
}
