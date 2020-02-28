package com.org.mygui;

import com.org.mygui.listener.ExitActionListener;
import com.org.mygui.listener.TextActionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Z_HAO on 2020/2/28
 * @author Z_HAO
 */
public class MyFrameTwo {
    final static int X = 1200;
    final static int Y = 800;

    private static void closeWindow(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Frame frame = new Frame("My GUI2");
        frame.setLayout(null);
        frame.setBounds(0 , 0 , X , Y);
        frame.setBackground(new Color(255 , 255 , 255));
        frame.setVisible(true);
        closeWindow(frame);

        Panel panel = new Panel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(120 , 120 , 120));
        panel.setBounds(100 , Y / 2 , X / 2 , Y / 2);
        frame.add(panel);

        Button button = new Button("Exit");
        button.setActionCommand("Button-exit");
        panel.add(button , BorderLayout.SOUTH);
        button.addActionListener(new ExitActionListener());

        TextField textField = new TextField();
        textField.setSize(400, 200);
        //textField.setEchoChar('*');
        panel.add(textField , BorderLayout.CENTER);

        textField.addActionListener(new TextActionListener());
    }
}