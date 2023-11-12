package developbeginner.bridge.practiece.answer1;

import developbeginner.bridge.example.CountDisplay;
import developbeginner.bridge.example.DisplayImpl;

import java.util.Random;

public class RandomDisplay extends CountDisplay {
    private Random random = new Random();

    public RandomDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void randomDisplay(int times) {
        multiDisplay(random.nextInt(times));
    }
}
