package developbeginner.state.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {
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

        useButton.addActionListener(this);
        alarmButton.addActionListener(this);
        phoneButton.addActionListener(this);
        exitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == alarmButton) {
            state.doUse(this);
        } else if (e.getSource() == alarmButton) {
            state.doAlarm(this);
        } else if (e.getSource() == phoneButton) {
            state.doPhone(this);
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        } else {
            System.out.println("?");
        }
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
