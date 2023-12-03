package developbeginner.state.practiece.answer3;

import developbeginner.state.example.Context;
import developbeginner.state.example.DayState;
import developbeginner.state.example.State;

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
        context.changeState(UrgentState.getInstance());
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
