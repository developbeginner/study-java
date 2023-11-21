package developbeginner.decorator.practiece.answer2;

import developbeginner.decorator.example.Display;
import developbeginner.decorator.example.FullBorder;
import developbeginner.decorator.example.SideBorder;

public class Main {
    public static void main(String[] args) {
        MultiStringDisplay display1 = new MultiStringDisplay();
        display1.add("Good Morning");
        display1.add("Good Night");
        display1.show();

        Display display2 = new SideBorder(display1, '#');
        display2.show();

        Display display3 = new FullBorder(display1);
        display3.show();
    }
}
