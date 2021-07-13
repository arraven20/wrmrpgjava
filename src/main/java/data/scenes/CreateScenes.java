package data.scenes;

import data.scenes.directions.North;
import data.scenes.directions.South;

import java.util.HashMap;

public class CreateScenes {

    public static HashMap<Integer, Scene> create(){
        HashMap<Integer, Scene> scenes = new HashMap<>();

        Scene s1 = new Scene(1, "Scene 1", "Description scene 1");
        Scene s2 = new Scene(2, "Scene 2", "description scene 2");

        s1.setSouth(new South("To s2", 2));
        s2.setNorth(new North("To S1", 1));

        scenes.put(s1.getSceneId(), s1);
        scenes.put(s2.getSceneId(), s2);

        return scenes;
    }
}
