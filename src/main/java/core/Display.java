package core;

import data.scenes.Scene;

public class Display {
    private static String FEEDBACK = "";

    public static void setFeedback(String text){
        FEEDBACK = text;
    }

    public static String displayCurrentSceneInfo(){
        Scene currentScene = Engine.getCurrentScene();
        return currentScene.getDescription() + " " + currentScene.getNorth().getDescription();
    }

    public static String displayCurrentSceneTitle(){
        Scene currentScene = Engine.getCurrentScene();
        return currentScene.getTitle();
    }

    public static String feedback(){
        return FEEDBACK;
    }
}
