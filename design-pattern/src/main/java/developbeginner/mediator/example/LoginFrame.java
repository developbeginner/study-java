package developbeginner.mediator.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUsername;
    private ColleagueTextField textPassword;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) {
        super(title);

        setBackground(Color.lightGray);
        setLayout(new GridLayout(4, 2));
        createColleagues();

        add(checkGuest);
        add(checkLogin);
        add(new Label("Username"));
        add(textUsername);
        add(new Label("Password"));
        add(textPassword);
        add(buttonOk);
        add(buttonCancel);

        colleagueChanged();
        pack();
        setVisible(true);
    }

    @Override
    public void createColleagues() {
        CheckboxGroup group = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", group, true);
        checkLogin = new ColleagueCheckbox("Login", group, false);

        textUsername = new ColleagueTextField("", 10);
        textPassword = new ColleagueTextField("", 10);
        textPassword.setEchoChar('*');

        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUsername.setMediator(this);
        textPassword.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkGuest);
        textUsername.addTextListener(textUsername);
        textPassword.addTextListener(textPassword);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            textUsername.setColleagueEnabled(false);
            textPassword.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        } else {
            textUsername.setColleagueEnabled(true);
            userPassChanged();
        }
    }

    private void userPassChanged() {
        if (textUsername.getText().length() > 0) {
            textPassword.setColleagueEnabled(true);
            if (textPassword.getText().length() > 0) {
                buttonOk.setColleagueEnabled(true);
            } else {
                buttonOk.setColleagueEnabled(false);
            }
        } else {
            textPassword.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
