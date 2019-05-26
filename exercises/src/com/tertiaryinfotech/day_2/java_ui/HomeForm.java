package com.tertiaryinfotech.day_2.java_ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeForm {
    private JPanel jPanel;
    private JButton exitApplicationButton;

    public HomeForm() {
        exitApplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void openHomeScreen() {
        JFrame frame = new JFrame("Home Screen");
        frame.setContentPane(new HomeForm().jPanel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
