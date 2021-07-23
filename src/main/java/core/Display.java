package core;

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
        StringBuilder test = new StringBuilder();
        test.append(Engine.getPlayer().getName());
        test.append("\n");
        test.append("player info");

        return test.toString();
    }
}
