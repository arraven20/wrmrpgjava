package core;

import data.actors.Actor;
import data.actors.CreateActors;
import data.scenes.CreateScenes;
import data.scenes.Scene;

import java.util.HashMap;

public class Engine {

    private static HashMap<Integer, Scene> SCENES = new HashMap<>();

    private static Scene CURRENT_SCENE;
    private static Actor PLAYER;

    public static void dataSetup(){
        SCENES = CreateScenes.create();
        Actor intialPlayer = CreateActors.createPlayer();

        setCurrentScene(getScene(1));
        setPlayer(CreateActors.createPlayer());
    }

    public static void setCurrentScene(Scene s){ CURRENT_SCENE = s; }

    public static void setFeedbackText(String text){ Display.setFeedback(text); }

    private static void setPlayer(Actor pc){ PLAYER = pc; }

    public static void setPlayerScene(Scene newScene){}



    public static Scene getScene(int sId){ return SCENES.get(sId); }

    public static void getUserInput(String input){ Actions.recieveAction(input.toLowerCase()); }

    public static Scene getCurrentScene(){ return CURRENT_SCENE; }

}
