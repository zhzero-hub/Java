package com.org.mygui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Z_HAO 2020/2/28
 */
public class ExitActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println(actionEvent.getActionCommand() + ": Exit");
        System.exit(0);
    }
}
