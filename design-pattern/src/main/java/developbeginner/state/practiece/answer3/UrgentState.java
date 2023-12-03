package developbeginner.state.practiece.answer3;

import developbeginner.state.example.Context;
import developbeginner.state.example.DayState;
import developbeginner.state.example.State;

public class UrgentState implements State {
    private static UrgentState instance = new UrgentState();

    private UrgentState() {

    }

    public static State getInstance() {
        return instance;
    }

    @Override
    public void doClock(Context context, int hour) {

    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("Use Safe... Alarm!!! (Urgent)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Alarm!!! (Urgent)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("Use Phone Call... Alarm!!! (Urgent)");
    }

    @Override
    public String toString() {
        return "[Urgent State]";
    }
}
