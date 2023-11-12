package developbeginner.bridge.practiece.answer3;

import developbeginner.bridge.example.CountDisplay;
import developbeginner.bridge.example.DisplayImpl;

public class IncreaseDisplay extends CountDisplay {
    private int step;

    public IncreaseDisplay(DisplayImpl displayImpl, int step) {
        super(displayImpl);
        this.step = step;
    }

    public void increaseDisplay(int level) {
        int count = 0;
        for (int i = 0; i < level; i++) {
            multiDisplay(count);
            count += step;
        }
    }
}
