package gui;

import core.Display;
import core.Engine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fscene {

    private static JFrame frame = new JFrame("Game");
    private static JTextField SCENE_INFO = new JTextField();
    private static String SCENE_TEXT;

    public static void showScene(){
        SCENE_INFO.setEditable(false);
        SCENE_INFO.setText(Display.displayScene(0));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(SCENE_INFO, BorderLayout.CENTER);
        frame.add(userInput(), BorderLayout.SOUTH);
        frame.add(knop(), BorderLayout.EAST);

        frame.pack();
        frame.setVisible(true);
    }

    private static JTextField userInput(){
        JTextField input = new JTextField(10);
        input.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String text = input.getText();
                Engine.getUserInput(text);
                input.setText(null);
            }
        });
        return input;
    }

    private static JButton knop(){
        JButton b = new JButton("change scene_info text");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                SCENE_INFO.setText("test test test");
            }
        });

        return b;
    }


}
