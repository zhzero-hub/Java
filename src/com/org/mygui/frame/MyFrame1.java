package com.org.mygui.frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Z_HAO 2020/2/28
 */
public class MyFrame1 extends Frame {
    private static int X = 1200;
    private static int Y = 800;

    public void run() {
        setLayout(new GridLayout(2 , 1));
        //frame.setLayout(new FlowLayout(FlowLayout.CENTER));//设置布局方式
        //三种布局方式 FlowLayout BorderLayout GridLayout
        setBounds(0 , 0 , X , Y);
        setBackground(new Color(255 , 255 , 255));
        //frame.setLocation(200 , 200);//设定初始位置
        //frame.setResizable(false);//设为不可调节大小
        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2 , 1));
        add(panel1);
        panel1.add(panel2);
        for(int i = 1;i <= 2;i ++) {
            Button button = new Button("Button" + i);
            if(i == 1) {
                panel1.add(button , BorderLayout.WEST);
            }
            else {
                panel1.add(button , BorderLayout.EAST);
            }
        }
        for(int i = 3;i <= 4;i ++) {
            Button button = new Button("Button" + i);
            panel2.add(button);
        }
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
