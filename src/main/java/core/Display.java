package core;

import data.scenes.Scene;

public class Display {

    public static String displayScene(int sceneId){
        Scene currentScene = Engine.getScene(sceneId);
        return currentScene.getTitle() + " " + currentScene.getNorth().getDescription();
    }
}
