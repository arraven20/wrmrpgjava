package gui;

import core.Display;
import core.Engine;

import javax.swing.*;
import java.awt.*;


public class Fscene {

    private final static JFrame frame = new JFrame("Game");
    private final static JTextArea SCENE_INFO = new JTextArea(10, 20);
    private final static JTextField SCENE_TITLE = new JTextField();
    private final static JTextField FEEDBACK = new JTextField(20);
    //private final static JTextArea PLAYER_INFO = new JTextArea(20, 20);

    public static void showScene(){
        SCENE_TITLE.setEditable(false);
        SCENE_INFO.setEditable(false);
        FEEDBACK.setEditable(false);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame.add(pagePanel(),);
        frame.add(test());
        frame.pack();
        frame.setVisible(true);
    }

    private static JPanel test(){
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(layout);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(pagePanel(), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(PlayerPanel.playerPanel(), gbc);

        return panel;
    }

    private static JPanel pagePanel(){
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(layout);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(scenePanel(), gbc);

//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.gridx = 1;
//        gbc.gridy = 0;
//        panel.add(playerInfo(), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(feedback(), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(userInput(), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(knop(), gbc);

        return panel;
    }

    private static JPanel scenePanel(){
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        SCENE_TITLE.setText(Display.displayCurrentSceneTitle());
        SCENE_INFO.setText(Display.displayCurrentSceneInfo());

        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(layout);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(SCENE_TITLE, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(SCENE_INFO, gbc);


        return panel;
    }

    private static JPanel feedback(){
        JPanel panel = new JPanel();
        FEEDBACK.setText("");

        panel.add(FEEDBACK);
        return panel;
    }

    private static JPanel userInput(){
        JPanel panel = new JPanel();
        JTextField input = new JTextField(10);
        input.addActionListener(e -> {
            String text = input.getText();
            Engine.getUserInput(text);
            input.setText(null);
            refreshData();
        });
        panel.add(input);
        return panel;
    }

    private static JPanel knop(){
        JPanel panel = new JPanel();
        JButton b = new JButton("character info");
        b.setBounds(50,100,95,30);
        b.addActionListener(e -> SCENE_INFO.setText("test test test"));
        panel.add(b);

        return panel;
    }

//    private static JPanel playerInfo(){
//        JPanel panel = new JPanel();
//        PLAYER_INFO.setText(Display.playerInfo());
//
//        panel.add(PLAYER_INFO);
//        return panel;
//    }

    private static void refreshData(){
        SCENE_TITLE.setText(Display.displayCurrentSceneTitle());
        SCENE_INFO.setText(Display.displayCurrentSceneInfo());
        FEEDBACK.setText(Display.feedback());
        PlayerPanel.PLAYER_INFO.setText(Display.playerInfo());
    }
}
