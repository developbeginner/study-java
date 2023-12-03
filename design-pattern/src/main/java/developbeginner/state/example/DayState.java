package developbeginner.state.example;

public class DayState implements State {
    private static DayState instance = new DayState();

    private DayState() {

    }

    public static State getInstance() {
        return instance;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || hour >= 17) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("Use Safe... (Day)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Alarm!!! (Day)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("Use Phone Call... (Day)");
    }

    @Override
    public String toString() {
        return "[Day Time]";
    }
}
