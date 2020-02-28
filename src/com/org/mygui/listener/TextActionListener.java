package com.org.mygui.listener;

import javafx.scene.control.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Z_HAO 2020/2/28
 */
public class TextActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TextField textField = (TextField)actionEvent.getSource();
        System.out.println(textField.getText());
        textField.setText("");
    }
}
