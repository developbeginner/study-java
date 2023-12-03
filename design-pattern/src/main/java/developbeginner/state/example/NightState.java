package developbeginner.state.example;

public class NightState implements State {
    private static NightState instance = new NightState();

    private NightState() {

    }

    public static State getInstance() {
        return instance;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 9 && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("Use Safe... Alarm!!! (Night)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Alarm!!! (Night)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("Use Phone Call... (Night)");
    }

    @Override
    public String toString() {
        return "[Night Time]";
    }
}
