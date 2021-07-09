package data.scenes;

import data.scenes.directions.North;
import data.scenes.directions.South;

import java.util.HashMap;

public class Scene {
    int sceneId;
    String title;
    String description;
    HashMap<String, Object> EXITS = new HashMap<>();
    North NORTH;
    South SOUTH;

    public Scene(int sceneId, String title, String description){
        this.sceneId = sceneId;
        this.title = title;
        this.description = description;
    }

    public void setNorth(North n){ this.EXITS.put("north", n); }

    public void setSouth(South s){ this.SOUTH = s; }


    public int getSceneId(){
        return this.sceneId;
    }

    public String getTitle(){
        return this.title;
    }

    public String getDescription(){
        return this.description;
    }

    public North getNorth(){ return (North)EXITS.get("north"); }

}


