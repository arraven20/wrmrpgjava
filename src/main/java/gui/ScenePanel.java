package gui;

import core.Display;

import javax.swing.*;
import java.awt.*;

public class ScenePanel {

    public final static JTextArea SCENE_INFO = new JTextArea(10, 20);
    public final static JTextField SCENE_TITLE = new JTextField();

    public static JPanel scenePanel(){
        SCENE_TITLE.setEditable(false);
        SCENE_INFO.setEditable(false);

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


}
