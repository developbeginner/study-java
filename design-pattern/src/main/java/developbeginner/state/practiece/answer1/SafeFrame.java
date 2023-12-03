package developbeginner.state.practiece.answer1;

import developbeginner.state.example.Context;
import developbeginner.state.example.DayState;
import developbeginner.state.example.State;

import java.awt.*;

public class SafeFrame extends Frame implements Context {
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);
    private Button useButton = new Button("Use Safe");
    private Button alarmButton = new Button("Use Alarm");
    private Button phoneButton = new Button("Use Phone");
    private Button exitButton = new Button("Exit");

    private State state = DayState.getInstance();

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel = new Panel();
        panel.add(useButton);
        panel.add(alarmButton);
        panel.add(phoneButton);
        panel.add(exitButton);
        add(panel, BorderLayout.SOUTH);

        pack();
        setVisible(true);

        useButton.addActionListener(e -> state.doUse(this));
        alarmButton.addActionListener(e -> state.doUse(this));
        phoneButton.addActionListener(e -> state.doUse(this));
        exitButton.addActionListener(e -> state.doUse(this));
    }

    @Override
    public void setClock(int hour) {
        String clockString = String.format("Current Time is %02d:00", hour);
        System.out.println(clockString);
        textClock.setText(clockString);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("State changed " + this.state + " To " + state + ".");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String message) {
        textScreen.append("CALL! " + message + "\n");
    }

    @Override
    public void recordLog(String message) {
        textScreen.append("RECORD ... " + message + "\n");
    }
}
