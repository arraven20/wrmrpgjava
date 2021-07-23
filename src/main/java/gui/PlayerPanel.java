package gui;

import core.Display;

import javax.swing.*;
import java.awt.*;

public class PlayerPanel {

    public final static JTextArea PLAYER_INFO = new JTextArea(20, 20);

    public static JPanel playerPanel(){
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(layout);

        PLAYER_INFO.setEditable(false);

//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        panel.add(scenePanel(), gbc);
//
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(playerInfo(), gbc);
//
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.gridx = 0;
//        gbc.gridy = 1;
//        panel.add(feedback(), gbc);
//
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.gridx = 0;
//        gbc.gridy = 2;
//        panel.add(userInput(), gbc);
//
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.gridx = 1;
//        gbc.gridy = 2;
//        panel.add(knop(), gbc);

        return panel;
    }

    private static JPanel playerInfo(){
        JPanel panel = new JPanel();
        PLAYER_INFO.setText(Display.playerInfo());

        panel.add(PLAYER_INFO);
        return panel;
    }

    public static void refreshData(){
        PLAYER_INFO.setText(Display.playerInfo());
    }
}
