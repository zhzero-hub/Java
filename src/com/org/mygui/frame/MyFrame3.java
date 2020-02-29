package com.org.mygui.frame;

import com.org.mygui.listener.CalActionListener;
import com.org.mygui.listener.CloseWindowListener;
import com.org.mygui.listener.TextActionListener;

import java.awt.*;
import java.util.concurrent.Flow;

/**
 * @author Z_HAO 2020/2/29
 */
public class MyFrame3 extends Frame {
    private static int X = 1200;
    private static int Y = 800;
    String ver = "v1.0.0";
    private static FlowLayout Layout = new FlowLayout(FlowLayout.CENTER);

    private void createFrame() {
        setTitle("Calculator " + ver);
        setLayout(null);
        setBounds(0 , 0 , X , Y);
        setBackground(new Color(255 , 255 , 255));
        setLayout(Layout);
        setVisible(true);
        addWindowListener(new CloseWindowListener());
    }

    private TextField createTextField(int x , int y , int width , int length) {
        TextField textField = new TextField(10);
        textField.setBounds(x , y , width , length);
        textField.addActionListener(new TextActionListener());
        return textField;
    }

    private TextField createTextField(int width , int length) {
        TextField textField = new TextField(10);
        textField.setSize(width , length);
        textField.addActionListener(new TextActionListener());
        return textField;
    }

    private Label createLabel(String str , int x , int y , int width , int length) {
        Label label = new Label(str);
        label.setBounds(x , y , width , length);
        return label;
    }

    private Label createLabel(String str , int width , int length) {
        Label label = new Label(str);
        label.setSize(width , length);
        return label;
    }

    private Button createButton(TextField first , TextField second , TextField answer) {
        Button button = new Button("=");
        //button.setSize(200 , 100);
        button.addActionListener(new CalActionListener(first , second , answer));
        button.setVisible(true);
        return button;
    }

    public void run() {
        createFrame();
        TextField firstText = createTextField(400 , 200);
        TextField secondField = createTextField(400 , 200);
        TextField answerField = createTextField(400 , 200);
        add(firstText);
        add(createLabel("+" , 200 , 100));
        add(secondField);
        add(createButton(firstText , secondField , answerField));
        add(answerField);
    }
}