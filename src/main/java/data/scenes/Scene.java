package data.scenes;

import data.scenes.directions.*;


public class Scene {
    int sceneId;
    String title;
    String description;
    North NORTH = new North("test north", 0);
    South SOUTH = new South("test south", 0);
    East EAST = new East("test east", 0);
    West WEST = new West("test west", 0);
    Up UP = new Up("test up", 0);
    Down DOWN = new Down("test down", 0);

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



}


