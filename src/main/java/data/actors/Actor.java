package data.actors;

import data.items.Weapon;

import java.io.Serializable;

public class Actor implements Serializable {

    private int id;
    private String name;
    private String type;
    private Attributes attributes;
    private Health health;
    private int defense;
    private int currentSceneId;
    private Weapon weapon;


    public Actor(int id, String name, String type){
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public void setAttributes(Attributes values){ this.attributes = values; }

    public void setHealth(){
        int max_hp = this.attributes.getWarrior() + 6;
        int max_mana = this.attributes.getMage() * 2;
        this.health = new Health(max_hp, max_mana);
    }

    public void calculateAndSetDefense(){
        this.defense = (int) ((Math.floor(this.attributes.getWarrior() + this.attributes.getMage()) / 2) + 4);
    }

    public void setCurrentSceneId(int sceneId){ this.currentSceneId = sceneId; }

    public void setWeapon(Weapon weapon){ this.weapon = weapon; }


    public String getName(){ return this.name; }

    public Attributes getAttributes(){ return this.attributes; }

    public Health getHealth(){ return this.health; }

    public int getDefene(){ return this.defense; }

    public int getCurrentSceneId(){ return this.currentSceneId; }

    public Weapon getWeapon(){ return this.weapon; }


}
