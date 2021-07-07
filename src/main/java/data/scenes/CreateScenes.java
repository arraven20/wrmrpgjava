package data.scenes;

import java.util.HashMap;

public class CreateScenes {

    public static HashMap<Integer, Scene> create(){
        HashMap<Integer, Scene> scenes = new HashMap<>();

        Scene test = new Scene(0, "test title", "test description");

        scenes.put(test.getSceneId(), test);

        return scenes;
    }
}
