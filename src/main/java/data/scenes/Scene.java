package data.scenes;

import data.actors.Actor;
import data.scenes.directions.*;

import java.io.Serializable;


public class Scene implements Serializable {
    private final String NO_PASSAGE = "no passage";
    private int sceneId;
    private String title;
    private String description;
    private North NORTH = new North(NO_PASSAGE, 0);
    private South SOUTH = new South(NO_PASSAGE, 0);
    private East EAST = new East(NO_PASSAGE, 0);
    private West WEST = new West(NO_PASSAGE, 0);
    private Up UP = new Up(NO_PASSAGE, 0);
    private Down DOWN = new Down(NO_PASSAGE, 0);
    private Actor monster;

    public Scene(int sceneId, String title, String description){
        this.sceneId = sceneId;
        this.title = title;
        this.description = description;
    }

    public void setNorth(North n){ this.NORTH = n; }

    public void setSouth(South s){ this.SOUTH = s; }

    public void setEast(East e){ this.EAST = e; }

    public void setWest(West w){ this.WEST = w; }

    public void set_Up(Up u){ this.UP = u; }

    public void setDown(Down d){ this.DOWN = d; }

    public void setMonster(Actor monster){ this.monster = monster; }



    public int getSceneId(){
        return this.sceneId;
    }

    public String getTitle(){
        return this.title;
    }

    public String getDescription(){
        return this.description;
    }

    public North getNorth(){ return NORTH; }

    public South getSouth(){ return SOUTH; }

    public East getEast(){ return EAST; }

    public West getWest(){ return WEST; }

    public Up getUp(){ return UP; }

    public Down getDown(){ return DOWN; }

    public Actor getMonster(){ return this.monster; }



}


