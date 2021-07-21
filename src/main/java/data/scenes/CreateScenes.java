package data.scenes;

import data.Lock;
import data.scenes.directions.*;

import java.util.HashMap;

public class CreateScenes {

    public static HashMap<Integer, Scene> create(){
        HashMap<Integer, Scene> scenes = new HashMap<>();

        Scene s1 = new Scene(1, "Scene 1", "center");
        Scene s2 = new Scene(2, "Scene 2", "south of center");
        Scene s3 = new Scene(3, "Scene 3", "east of center");
        Scene s4 = new Scene(4, "Scene 4", "up of center");
        Scene s5 = new Scene(5, "Scene 5", "Down of center");

        s1.setSouth(new South("To s2", 2));
        s1.setEast(new East("To s3", 3));
        s1.set_Up(new Up("to s4", 4));
        s1.setDown(new Down("to s5",5, new Lock(true, "bronze")));
        s2.setNorth(new North("To S1", 1));
        s3.setWest(new West("To s1", 1));
        s4.setDown(new Down("To s1", 1));
        s5.set_Up(new Up("To s1", 1));

        scenes.put(s1.getSceneId(), s1);
        scenes.put(s2.getSceneId(), s2);
        scenes.put(s3.getSceneId(), s3);
        scenes.put(s4.getSceneId(), s4);
        scenes.put(s5.getSceneId(), s5);

        return scenes;
    }
}
