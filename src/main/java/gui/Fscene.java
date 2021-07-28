package gui;

import core.Display;
import core.Engine;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;


public class Fscene {

    private final static JFrame frame = new JFrame("Game");
    private final static JTextField FEEDBACK = new JTextField(20);


    public static void showScene(){
        FEEDBACK.setEditable(false);
        FEEDBACK.requestFocus();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
        panel.add(ScenePanel.scenePanel(), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(PlayerPanel.playerPanel(), gbc);

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
        panel.add(knopSave(), gbc);

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

    private static JPanel knopSave(){
        JPanel panel = new JPanel();
        JButton b = new JButton("save");
        b.setBounds(50,100,95,30);
        b.addActionListener(e -> {
            try {
                saveData();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        panel.add(b);

        return panel;
    }

    private static void refreshData(){
        ScenePanel.SCENE_TITLE.setText(Display.displayCurrentSceneTitle());
        ScenePanel.SCENE_INFO.setText(Display.showInfo());
        FEEDBACK.setText(Display.feedback());
        PlayerPanel.PLAYER_INFO.setText(Display.playerInfo());
    }

    private static void saveData() throws IOException { Engine.saveGame(); }
}
