package com.tertiaryinfotech.day_2.java_ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    private JTextField username;
    private JPasswordField password;
    private JButton loginButton;
    private JPanel jPanel;
    private JSlider slider1;
    private JButton registerButton;
    private static JFrame frame;

    public LoginForm() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = "";
                if (username.getText().length() == 0)
                    msg = "Username cannot be empty";
                else if (password.getPassword().length == 0)
                    msg = "Password cannot be empty";
                else if (username.getText().equals("hello") && new String(password.getPassword()).equals("world")) {
                    msg = "Login Successful";
                    frame.dispose();
                    HomeForm.openHomeScreen();

                } else
                    msg = "Failed to login";

                JOptionPane.showMessageDialog(null, msg + "\nUsername: " + username.getText());
            }
        });
    }

    public static void main(String s[]) {
        frame = new JFrame("Login Screen");
        frame.setContentPane(new LoginForm().jPanel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
