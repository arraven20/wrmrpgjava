package core;

import data.actors.Actor;
import data.scenes.Scene;

public class Display {
    private static String FEEDBACK = "";

    public static void setFeedback(String text){
        FEEDBACK = text;
    }

    public static String displayCurrentSceneInfo(){
        Scene currentScene = Engine.getCurrentScene();
        StringBuilder info = new StringBuilder();

        String north = "North: " + currentScene.getNorth().getDescription();

        info.append(currentScene.getDescription());
        info.append("\n");
        info.append(north);

        return info.toString();
    }

    public static String displayCurrentSceneTitle(){
        Scene currentScene = Engine.getCurrentScene();
        return currentScene.getTitle();
    }

    public static String feedback(){
        return FEEDBACK;
    }

    public static String playerInfo(){
        Actor pc = Engine.getPlayer();
        StringBuilder test = new StringBuilder();

        String newline = "\n";
        String health = "Health: " + pc.getHealth().getMax_hp() + " / " + pc.getHealth().getHp();
        String mana = "Mana: " + pc.getHealth().getMax_mana() + " / " + pc.getHealth().getMana();
        String warrior = "Warrior: " + pc.getAttributes().getWarrior();
        String rogue = "Rogue: " + pc.getAttributes().getRogue();
        String mage = "Mage: " + pc.getAttributes().getMage();
        test.append(pc.getName());
        test.append(newline);
        test.append(newline);
        test.append(health + " " + mana);
        test.append(newline);
        test.append(newline);
        test.append(warrior);
        test.append(newline);
        test.append(rogue);
        test.append(newline);
        test.append(mage);

        return test.toString();
    }


}
