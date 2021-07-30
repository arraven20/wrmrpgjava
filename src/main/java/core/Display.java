package core;

import data.actors.Actor;
import data.events.Combat;
import data.scenes.Scene;

public class Display {
    private static String FEEDBACK = "";
    private static final String NEWLINE = "\n";

    public static void setFeedback(String text){
        FEEDBACK = text;
    }

    public static String showInfo(){
        String gameState = Engine.getGameState();

        switch(gameState){
            case "WANDERING" -> { return displayCurrentSceneInfo(); }
            case "COMBAT" -> { return displayCombat(); }
            case "POSSIBLE_COMBAT" -> { return "possible combat"; }
        }
        return "Something went wrong with the game state";
//        if(Engine.getGameState().equals("WANDERING")){
//            return displayCurrentSceneInfo();
//        }
//        else if(Engine.getGameState().equals("COMBAT")){
//            return displayCombat();
//        }
//        else{
//            return "Something went wrong with the game state";
//        }
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
        Actor combatant = Engine.getCurrentScene().getEvent().getCombatant();
        StringBuilder combat = new StringBuilder();
        if(Engine.playerHasInitiative(combatant)){
            combat.append("You see a ")
                    .append(combatant.getName())
                    .append(" wielding a ")
                    .append(combatant.getWeapon().getName());
        }else{
            combat.append("a ")
                    .append(combatant.getName())
                    .append(" wielding a ")
                    .append(combatant.getWeapon().getName())
                    .append(" attacks you");
        }

        return combat.toString();
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
