package gui;

import core.Engine;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class StartScene {
    private final static JFrame frame = new JFrame("Game");

    public static void showScene() throws IOException, ClassNotFoundException {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(buttons());
        frame.pack();
        frame.setVisible(true);
    }

    private static JPanel buttons() throws IOException, ClassNotFoundException {
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(layout);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(knopNew(), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(knopLoad(), gbc);

        return panel;
    }


    private static JPanel knopNew(){
        JPanel panel = new JPanel();
        JButton b = new JButton("New Game");
        b.setBounds(50,100,95,30);
        b.addActionListener(e -> {
            try {
                newGame();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
        });
        panel.add(b);

        return panel;
    }

    private static JPanel knopLoad(){
        JPanel panel = new JPanel();
        JButton b = new JButton("Load Game");
        b.setBounds(50,100,95,30);
        b.addActionListener(e -> {
            try {
                loadGame();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
        });
        panel.add(b);

        return panel;
    }

    private static void newGame() throws IOException, ClassNotFoundException {
        Engine.newGameSetup();
        Fscene.showScene();
        frame.setVisible(false);
    }

    private static void loadGame() throws IOException, ClassNotFoundException {
        Engine.loadGame();
        Fscene.showScene();
        frame.setVisible(false);
    }
}
