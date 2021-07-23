package data.actors;

import data.scenes.Scene;

public class Actor {

    private int id;
    private String name;
    private String type;
    private Attributes attributes;
    private Health health;
    private int defense;
    private Scene currentScene;


    public Actor(int id, String name, String type){
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Attributes getAttributes(){ return this.attributes; }

    public Scene getCurrentScene(){ return this.currentScene; }

    public void setAttributes(Attributes values){ this.attributes = values; }

    public void setHealth(){
        int max_hp = this.attributes.warrior + this.attributes.rogue;
        int max_mana = 0;
        this.health = new Health(max_hp, max_mana);
    }

    public void setCurrentScene(Scene newScene){ this.currentScene = newScene; }


}
