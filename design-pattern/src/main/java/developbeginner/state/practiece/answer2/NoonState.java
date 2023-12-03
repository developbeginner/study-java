package developbeginner.state.practiece.answer2;

import developbeginner.state.example.Context;
import developbeginner.state.example.DayState;
import developbeginner.state.example.NightState;
import developbeginner.state.example.State;

public class NoonState implements State {
    private static NoonState instance = new NoonState();

    private NoonState() {

    }

    public static State getInstance() {
        return instance;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || hour >= 17) {
            context.changeState(NightState.getInstance());
        } else if (hour >= 9 && hour < 12 || hour >= 13 && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("Use Safe... Alarm!!! (Noon)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Alarm!!! (Noon)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("Use Phone Call... (Noon)");
    }

    @Override
    public String toString() {
        return "[Noon Time]";
    }
}
