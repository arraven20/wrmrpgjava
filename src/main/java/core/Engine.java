package core;

import data.actors.Actor;
import data.actors.CreateActors;
import data.items.Damage;
import data.items.Weapon;
import data.scenes.CreateScenes;
import data.scenes.Scene;

import java.io.IOException;
import java.util.HashMap;

public class Engine {

    static HashMap<Integer, Scene> SCENES = new HashMap<>();

    private static Scene CURRENT_SCENE;
    private static Actor PLAYER;
    private static String GAME_STATE = "WANDERING";
    private static Actor ACTIVE_OPPONENT;

    public static void dataSetup() throws IOException, ClassNotFoundException {
        newGameSetup();
    }

    public static void setActiveOpponent(Actor opponent){ ACTIVE_OPPONENT = opponent; }

    public static void setGameState(String state){ GAME_STATE = state; }

    public static String getGameState(){ return GAME_STATE; }

    public static Actor getActiveOpponent(){ return ACTIVE_OPPONENT; }

    public static void newGameSetup() throws IOException, ClassNotFoundException{
        SCENES = CreateScenes.create();
        FileHandler.writeScenes(SCENES);
        PLAYER = CreateActors.createInitialPlayer();
        FileHandler.writePlayer(PLAYER);
        setCurrentScene(getScene(PLAYER.getCurrentSceneId()));
        System.out.println("New Game set up");
    }

    public static void loadGame() throws IOException, ClassNotFoundException {
        SCENES = FileHandler.readScenes();
        PLAYER = FileHandler.readPlayer();
        CURRENT_SCENE = getScene(PLAYER.getCurrentSceneId());
        System.out.println("Game loaded");
    }

    public static void saveGame() throws IOException {
        FileHandler.writeScenes(SCENES);
        PLAYER.setCurrentSceneId(CURRENT_SCENE.getSceneId());
        FileHandler.writePlayer(PLAYER);
        System.out.println("Game saved");
    }

    public static Scene getScene(int sId){ return SCENES.get(sId); }

    public static void getUserInput(String input){ Actions.receiveAction(input.toLowerCase()); }

    public static Scene getCurrentScene(){ return CURRENT_SCENE; }

    public static Actor getPlayer(){ return PLAYER; }

    public static void setCurrentScene(Scene s){ CURRENT_SCENE = s; }

    public static void setFeedbackText(String text){ Display.setFeedback(text); }

    public static int getActorInitiative(Actor actor){
        int roll = Dice.d6();
        System.out.println(actor.getName() + " init: " + roll);
        return roll;
    }

    public static boolean playerHasInitiative(Actor combatant){
        int playerInit = Dice.d6();
        int combatantInit = Dice.d6();

        return playerInit > combatantInit;
    }

    public static boolean playerCheckSuccess(int player, int other){
        return player > other;
    }

    public static Integer calculateWeaponDamage(Weapon weapon){
        int dieRoll = Dice.d6();
        int bonusAmount = weapon.getDamage().getBonus();
        String bonus = weapon.getDamage().getBonusType();
        System.out.println(dieRoll + bonus + bonusAmount);
        switch (bonus){
            case "+" -> { return dieRoll + bonusAmount; }
            case "-" -> { return dieRoll - bonusAmount; }
            case "/" -> {return dieRoll / bonusAmount; }
        }
        return 0;
    }
}
