package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    public int count = 0;
    public JLabel label;
    public JFrame frame;
    public JPanel panel;
    public JButton button;
    public JButton button2;
    public JTextField textField;
    public JPasswordField passwordField;
    public JLabel successLabel;
    public String userName;
    public String password;

    public GUI() {
         frame = new JFrame();
         button = new JButton("Click");
         button2 = new JButton("Click me too");
        button.addActionListener(this);
        label = new JLabel("Number of clicks: " + count);
        successLabel = new JLabel("");
         panel = new JPanel();
        textField = new JTextField(20);
        passwordField = new JPasswordField(20);
       // panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        button2.setBounds(10, 80, 80, 25);
        button2.addActionListener(this);
        panel.add(button);
        panel.add(button2);
        panel.add(label);
        panel.add(successLabel);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Slavyan's GUI");
        frame.setSize(500, 350);
        frame.pack();
        frame.setVisible(true);
        textField.setBounds(100, 20, 165,25);
        panel.add(textField);
        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            userName = textField.getText();
            password = passwordField.getText();

        if (e.getSource() == button) {
            count++;
            label.setText("Number of clicks: " + count);
        }

        if (e.getSource() == button2){
            if(userName.equals("Slavyan") && password.equals("1234"))
            successLabel.setText("You logged in!");
            else
                successLabel.setText("");
        }
    }
}
