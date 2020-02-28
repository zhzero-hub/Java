package com.org.mygui.listener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author Z_HAO 2020/2/28
 */
public class CloseWindowListener extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
    }
}
