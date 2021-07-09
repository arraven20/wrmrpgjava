package data.scenes;

import data.scenes.directions.North;
import data.scenes.directions.South;

import java.util.HashMap;

public class CreateScenes {

    public static HashMap<Integer, Scene> create(){
        HashMap<Integer, Scene> scenes = new HashMap<>();

        Scene test = new Scene(0, "test title", "test description");

        test.setNorth(new North("north desc", 1));
        test.setSouth(new South("south desc", 2));

        scenes.put(test.getSceneId(), test);

        return scenes;
    }
}
