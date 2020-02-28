package com.org.mygui.frame;

import com.org.mygui.listener.CloseWindowListener;
import com.org.mygui.listener.ExitActionListener;
import com.org.mygui.listener.TextActionListener;

import java.awt.*;

/**
 * @author Z_HAO 2020/2/28
 */
public class MyFrame2 extends Frame {
    private static int X = 1200;
    private static int Y = 800;

    public void run() {
        setLayout(null);
        setBounds(0 , 0 , X , Y);
        setBackground(new Color(255 , 255 , 255));
        setVisible(true);
        addWindowListener(new CloseWindowListener());

        Panel panel = new Panel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(120 , 120 , 120));
        panel.setBounds(100 , Y / 2 , X / 2 , Y / 2);
        add(panel);

        Button button = new Button("Exit");
        button.setActionCommand("Button-exit");
        panel.add(button , BorderLayout.SOUTH);
        button.addActionListener(new ExitActionListener());

        TextField textField = new TextField();
        textField.setSize(400, 200);
        textField.setEchoChar('*');
        panel.add(textField , BorderLayout.CENTER);
        textField.addActionListener(new TextActionListener());
    }
}
