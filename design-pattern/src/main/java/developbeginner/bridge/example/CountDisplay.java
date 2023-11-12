package developbeginner.bridge.example;

public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void multiDisplay(int items) {
        open();
        for (int i = 0; i < items; i++) {
            print();
        }
        close();
    }
}
