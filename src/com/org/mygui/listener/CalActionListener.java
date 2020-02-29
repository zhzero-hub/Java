package com.org.mygui.listener;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Z_HAO 2020/2/29
 */
public class CalActionListener implements ActionListener {
    private TextField first;
    private TextField second;
    private TextField answer;

    public CalActionListener(TextField first , TextField second , TextField answer) {
        this.first = first;
        this.second = second;
        this.answer = answer;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int a = Integer.parseInt(first.getText());
        int b = Integer.parseInt(second.getText());
        int ans = a + b;
        answer.setText(String.valueOf(ans));
        first.setText("");
        second.setText("");
    }
}
