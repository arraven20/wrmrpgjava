package core;

import data.actors.Actor;
import data.scenes.Scene;

public class Display {
    private static String FEEDBACK = "";
    private static final String NEWLINE = "\n";

    public static void setFeedback(String text){
        FEEDBACK = text;
    }

    public static String showInfo(){
        if(Engine.getGameState().equals("WANDERING")){
            return displayCurrentSceneInfo();
        }
        else if(Engine.getGameState().equals("COMBAT")){
            return displayCombat();
        }
        else{
            return "Something went wrong with the game state";
        }
    }

    public static String displayCurrentSceneInfo(){
        Scene currentScene = Engine.getCurrentScene();
        StringBuilder info = new StringBuilder();

        String north = "North: " + currentScene.getNorth().getDescription();
        String south = "South: " + currentScene.getSouth().getDescription();
        String east = "East: " + currentScene.getEast().getDescription();
        String west = "West: " + currentScene.getWest().getDescription();
        String up = "Up: " + currentScene.getUp().getDescription();
        String down = "Down: " + currentScene.getDown().getDescription();



        info.append(currentScene.getDescription());
        info.append(NEWLINE);
        info.append(NEWLINE);
        info.append(north);
        info.append(NEWLINE);
        info.append(south);
        info.append(NEWLINE);
        info.append(east);
        info.append(NEWLINE);
        info.append(west);
        info.append(NEWLINE);
        info.append(up);
        info.append(NEWLINE);
        info.append(down);

        return info.toString();
    }

    public static String displayCombat(){
        Actor monster = Engine.getCurrentScene().getMonster();
        StringBuilder monsterInfo = new StringBuilder();
        monsterInfo.append(monster.getName());

        return monsterInfo.toString();
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
        StringBuilder player = new StringBuilder();

        String health = "Health: " + pc.getHealth().getMax_hp() + " / " + pc.getHealth().getHp();
        String mana = "Mana: " + pc.getHealth().getMax_mana() + " / " + pc.getHealth().getMana();
        String warrior = "Warrior: " + pc.getAttributes().getWarrior();
        String rogue = "Rogue: " + pc.getAttributes().getRogue();
        String mage = "Mage: " + pc.getAttributes().getMage();
        String defense = "Defense: " + pc.getDefene();
        player.append(pc.getName());
        player.append(NEWLINE);
        player.append(NEWLINE);
        player.append(health).append(" ").append(mana);
        player.append(NEWLINE);
        player.append(NEWLINE);
        player.append(warrior);
        player.append(NEWLINE);
        player.append(rogue);
        player.append(NEWLINE);
        player.append(mage);
        player.append(NEWLINE);
        player.append(defense);

        return player.toString();
    }


}
