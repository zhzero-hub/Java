package com.org.mygui.listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Z_HAO 2020/2/28
 */
public class TextActionListener implements ActionListener {
    private TextField textField = null;

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        textField = (TextField)actionEvent.getSource();
        System.out.println(textField.getText());
        textField.setText("");
    }

    public TextField getTextField() {
        return textField;
    }
}
