package core;

import data.scenes.CreateScenes;
import data.scenes.Scene;

import java.util.HashMap;

public class Engine {

    private static HashMap<Integer, Scene> SCENES = new HashMap<>();

    public static void dataSetup(){
        SCENES = CreateScenes.create();
    }

    public static Scene getScene(int sId){
        return SCENES.get(sId);
    }

    public static void getUserInput(String input){
        System.out.println(input);
    }

}
