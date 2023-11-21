package developbeginner.decorator.practiece.answer1;

import developbeginner.decorator.example.Display;
import developbeginner.decorator.example.StringDisplay;

public class Main {
    public static void main(String[] args) {
        Display display1 = new StringDisplay("Hello World");
        Display display2 = new UpDownBorder(display1, '-');

        display2.show();
    }
}
