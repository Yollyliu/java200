package com.zz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windows {
    public static void main(String[] args) {
        JFrame j=new JFrame();
        j.setLayout(null);
        j.setSize(400,300);
        j.setVisible(true);


        final JLabel label=new JLabel();
        label.setText("hello");
        label.setSize(100,40);
        label.setLocation(10,20);
        j.add(label);

        final JTextField textField=new JTextField();
        textField.setText("hello");
        textField.setSize(100,40);
        textField.setLocation(10,110);
        j.add(textField);

        JButton button=new JButton();
        button.setText("hello");
        button.setSize(100,40);
        button.setLocation(10,60);
        j.add(button);


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText(textField.getText());
            }
        });

        
    }
}
